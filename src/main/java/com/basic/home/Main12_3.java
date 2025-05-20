package com.basic.home;

import java.util.Scanner;

public class Main12_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }

        int[] dp = new int[N];

        for(int i=0; i<N; i++){
            dp[i]=1;
        }

        // 3. 본격적인 LIS 계산 (이중 반복문)
        for (int i = 1; i < N; i++) { // 현재 위치
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int maxLen=0;
        for (int i = 0; i < N; i++) {
            maxLen = Math.max(maxLen, dp[i]);
        }

        System.out.println(maxLen);

    }
}

