package com.basic.home;

import java.util.Scanner;

public class Main10_6 {

    public static int[][] dp  =new int[35][35];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(combination(n,r));
    }

    private static int combination(int n, int r) {
        if (dp[n][r] > 0) return dp[n][r]; // 이미 계산된 값이 있으면 그대로 반환
        if (r == 0 || n == r) return 1; // 기본 케이스 (nC0 = 1, nCn = 1)

        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r); // 재귀 호출


    }
}
