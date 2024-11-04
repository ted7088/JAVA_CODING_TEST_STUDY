package com.basic.coding;

import java.util.Scanner;

public class Main8_10 {

    static int[][] maze = new int[7][7];
    static int[][] visited = new int[7][7];
    static int pathCount = 0;

    // 상하좌우 이동 방향 정의 (위, 아래, 왼쪽, 오른쪽)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 7x7 미로 격자판 입력 받기
        System.out.println("7x7 격자판 미로를 입력하세요 (0은 통로, 1은 벽):");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        // (0,0)에서 출발하여 DFS 실행
        dfs(0, 0);

        // 경로 수 출력
        System.out.println("탈출 경로의 가지수: " + pathCount);
    }

    public static void dfs(int x, int y) {
        // 도착점에 도달하면 경로 수 증가
        if (x == 6 && y == 6) {
            pathCount++;
            return;
        }

        // 현재 위치 방문 표시
        visited[x][y] = 1;

        // 상하좌우로 이동
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 격자 범위 내에 있고, 방문하지 않은 통로(0)일 때 이동
            if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && maze[nx][ny] == 0 && visited[nx][ny] == 0) {
                dfs(nx, ny);
            }
        }

        // 백트래킹: 방문 해제
        visited[x][y] = 0;
    }
}
