package com.bj.coding;

import java.util.Scanner;

public class BJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 10으로 나눈 값의 나머지 -> 1의 자리가
        System.out.println(a * (b % 10));
        // 100으로 나눈 값의 나머지를 10으로 나눈 목 -> 10의 자리
        System.out.println(a * ((b % 100) / 10));
        // 100으로 나눈 몫 -> 100의 자리
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
