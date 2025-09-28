package com.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Main9_3 {

    static int N, M;
    static int[] score, time;
    static int answer = 0;

    static int[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        score = new int[N];
        time = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        sc.close();

        visited = new int[N + 1][M + 1];
        for (int i = 0; i <= N; i++) Arrays.fill(visited[i], -1);

        dfs(0, 0, 0);
        System.out.println(answer);


    }

    static void dfs(int idx, int usedTime, int sumScore) {
        // 1) 시간 초과 가지치기
        if (usedTime > M) return;

        // 2) 현재까지 점수로 정답 갱신
        if (sumScore > answer) answer = sumScore;

        // 3) 모든 문제를 다 보았으면 종료
        if (idx == N) return;

        // 4) 메모이제이션 가지치기:
        //    같은 (idx, usedTime) 상태에 이전에 더 높은 점수로 도달한 적이 있다면 현재 경로는 볼 필요 없음
        if (visited[idx][usedTime] >= sumScore) return;
        visited[idx][usedTime] = sumScore;

        // 5) 선택지 2개: idx 문제를 푼다 / 안 푼다
        // 5-1) 푼다
        dfs(idx + 1, usedTime + time[idx], sumScore + score[idx]);
        // 5-2) 안 푼다
        dfs(idx + 1, usedTime, sumScore);

    }
}
