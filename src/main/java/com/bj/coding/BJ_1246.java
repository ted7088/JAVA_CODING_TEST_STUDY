package com.bj.coding;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] prices = new int[M];

        for (int i = 0; i < M; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        int maxProfit = 0;
        int bestPrice = 0;

        for (int i = 0; i < M; i++) {
            int price = prices[i];
            int buyers = M - i;
            int sellCount = Math.min(N, buyers);
            int profit = price * sellCount;

            if (profit > maxProfit) {
                maxProfit = profit;
                bestPrice = price;
            }
        }

        System.out.println(bestPrice + " " + maxProfit);
        sc.close();
    }
}
