package com.inflearn;

import java.util.Scanner;

public class Main11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 돌의 개수

        int[] dp = new int[N + 1]; // dp[i]는 i번째 돌까지 가는 방법의 수

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]); // N번째 돌까지 가는 방법의 수 출력
    }
}
