package com.basic.home;

import java.util.Scanner;

public class Main9_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("피보나치 수열의 총 항수를 입력하세요 : ");

        int n = sc.nextInt();

        printFibonacci(n);

    }

    private static void printFibonacci(int n) {

        int a = 1, b = 1;

        System.out.println(a + " ");

        System.out.println(b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.println(next + " ");
            a = b;
            b = next;
        }

    }
}

