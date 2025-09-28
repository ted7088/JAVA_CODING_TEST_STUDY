package com.basic.home;

import java.util.Scanner;

public class Main9_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 n을 입력하세요 : ");

        int n = sc.nextInt();

        printNumbers(n);
    }

    private static void printNumbers(int n) {

        if(n==0){
            return;
        }
        printNumbers(n-1);

        System.out.println(n);
    }


}
