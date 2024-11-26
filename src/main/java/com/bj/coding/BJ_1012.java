package com.bj.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_1012 {

    static int[][] field;
    static boolean[][] visited;
    static int M, N; // 배추밭의 가로와 세로 크기
    static int[] dx = {0, 0, -1, 1}; // 상하좌우 이동
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) { // 테스트 케이스 반복

            M = sc.nextInt(); // 배추밭 가로 크기
            N = sc.nextInt(); // 배추밭 세로 크기
            int K = sc.nextInt(); // 배추 위치 개수

            field = new int[N][M];
            visited = new boolean[N][M];

            // 배추 위치 입력
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[y][x] = 1;
            }

            int worms = 0;

            // 모든 위치를 탐색하며 DFS 수행
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        performDFS(i, j); // DFS 호출
                        worms++; // 새로운 지렁이 필요
                    }
                }
            }

            System.out.println(worms); // 각 테스트 케이스 결과 출력
        }
        sc.close();
    }

    // DFS 수행 메서드
    static void performDFS(int x, int y) {
        visited[x][y] = true;

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M && field[nx][ny] == 1 && !visited[nx][ny]) {
                performDFS(nx, ny); // 인접한 배추에 대해 DFS 호출
            }
        }
    }
}
