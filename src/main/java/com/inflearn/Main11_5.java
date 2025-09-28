package com.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Main11_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i]=sc.nextInt();
        }

        int M = sc.nextInt(); // 거슬러 줄 금액

        int[] dp = new int[M + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);  //초기화
        dp[0] = 0; // 0원을 만드는 최소 동전 개수는 0

        // 냅색 알고리즘 (Unbounded Knapsack)
        for (int coin : coins) {
            for (int i = coin; i <= M; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        System.out.println(dp[M]);
    }

}
