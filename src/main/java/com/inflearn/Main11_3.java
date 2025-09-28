package com.inflearn;

import java.util.Scanner;

public class Main11_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
            if(dp[i]>max){
                max=dp[i];
            }
        }

        System.out.println(max);

    }

}
