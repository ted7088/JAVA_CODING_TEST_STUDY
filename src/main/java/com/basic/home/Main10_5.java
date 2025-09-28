package com.basic.home;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Main10_5 {

    static int n, m;
    static int[] coins;
    static int minCoins = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        coins = new int[n];

        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }

        Arrays.sort(coins);
        m=sc.nextInt();

        DFS(0,0);

        System.out.println(minCoins);
    }

    private static void DFS(int level, int sum) {

        if (sum>m) return;
        if(level>=minCoins) return;
        if(sum==m){
            minCoins = Math.min(minCoins, level);
            return;
        }
        for(int i=0; i<n; i++){
            DFS(level+1, sum+coins[i]);
        }

    }
}
