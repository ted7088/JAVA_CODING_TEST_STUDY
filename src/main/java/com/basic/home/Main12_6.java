package com.basic.home;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] score = new int[N];
        int[] time = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        int[] dp = new int[M + 1];

        for (int i = 0; i < N; i++) {
            for (int j = M; j >= time[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - time[i]] + score[i]);  //점화식 사용
            }
        }

        System.out.println(dp[M]);

    }
}


