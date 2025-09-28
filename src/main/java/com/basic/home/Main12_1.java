package com.basic.home;

import java.util.Scanner;

public class Main12_1 {
    static int[] dp = new int[36];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계단의 수를 입력하세요 : ");
        int n = sc.nextInt();

        System.out.println(countWays(n));
    }

    private static int countWays(int n) {
        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<=n;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
