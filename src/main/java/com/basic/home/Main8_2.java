package com.basic.home;

import java.util.Scanner;

public class Main8_2 {
    static int C, N;
    static int[] weights;
    static int maxWeight = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        C = sc.nextInt();
        N = sc.nextInt();
        weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }

        // DFS 탐색 시작
        dfs(0, 0);

        // 결과 출력
        System.out.println(maxWeight);
    }

    // DFS 메서드
    private static void dfs(int index, int currentWeight) {
        // 현재 무게가 최대 적재량을 초과하면 종료
        if (currentWeight > C) {
            return;
        }

        // 모든 바둑이를 다 탐색한 경우
        if (index == N) {
            maxWeight = Math.max(maxWeight, currentWeight);
            return;
        }

        // 현재 바둑이를 태우지 않는 경우
        dfs(index + 1, currentWeight);

        // 현재 바둑이를 태우는 경우
        dfs(index + 1, currentWeight + weights[index]);
    }
}