package com.programmers;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //명함 개수 입력
        System.out.println("명함 개수 입력:");
        int n = sc.nextInt();

        int[][] sizes = new int[n][2];

        //명함 사이즈 입력
        System.out.println("각 명함의 세로 길이를 입력하시오:");
        for (int i = 0; i < n; i++) {
            sizes[i][0] = sc.nextInt(); // 가로
            sizes[i][1] = sc.nextInt(); // 세로
        }

        int result = solution(sizes);
        System.out.println("최소 지갑 크기: " + result);
        sc.close();
    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0;  // 지갑 가로
        int maxHeight = 0; // 지갑 세로

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            // 큰 쪽을 가로, 작은 쪽을 세로로 설정
            int big = Math.max(w, h);
            int small = Math.min(w, h);

            // 현재까지 최대값 갱신
            maxWidth = Math.max(maxWidth, big); //가로
            maxHeight = Math.max(maxHeight, small);//세로
        }

        return maxWidth * maxHeight;
    }
}
