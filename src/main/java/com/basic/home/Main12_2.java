package com.basic.home;

import java.util.Scanner;

public class Main12_2 {
    static int[] dp = new int[37];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("돌의 계단의 수를 입력하세요 : ");
        int n = sc.nextInt();

        System.out.println(countWays(n));
    }

    private static int countWays(int n) {
        dp[0]=1;
        dp[1]=1;

        for(int i=2; i<=n+1;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n+1];
    }

}
