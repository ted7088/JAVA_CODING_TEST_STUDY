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
        time  = new int[N];

        for (int i = 0; i < N; i++) {
            score[i]=sc.nextInt();
            time[i]=sc.nextInt();
        }
        sc.close();

        visited = new int[N+1][M+1];
        for (int i = 0; i <= N; i++) Arrays.fill(visited[i], -1);




    }
}
