package com.programmers;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 길이 입력
        System.out.print("배열 길이 입력: ");
        int n = sc.nextInt();

        // prices 배열 입력
        int[] prices = new int[n];
        System.out.println("주식 가격 입력:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // 결과 계산
        int[] result = solution(prices);

        // 결과 출력
        System.out.println("결과:");
        for (int r : result) {
            System.out.print(r + " ");
        }

        sc.close();
    }

    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        // 각 시점마다 가격이 떨어지지 않은 기간 계산
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                cnt++;
                if (prices[j] < prices[i]) { // 가격이 떨어지면 중단
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
