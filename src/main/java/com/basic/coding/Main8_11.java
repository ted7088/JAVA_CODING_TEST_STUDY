package com.basic.coding;

import com.example.coding.Point;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main8_11 {

    static int[] dx = {-1, 0, 1, 0}; // 상하좌우 이동
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;

    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y)); // 큐에 시작점 추가
        dis[x][y] = 0; // 출발점의 거리 설정

        while (!Q.isEmpty()) {
            Point tmp = Q.poll(); // 큐에서 현재 위치를 꺼냄
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                // 배열 범위 확인 및 길인지 확인
                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 방문 표시
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // 이동 횟수 기록
                }
            }
        }
    }

    public static void main(String[] args) {
        Main8_11 T = new Main8_11();
        Scanner kb = new Scanner(System.in);
        board = new int[7][7];
        dis = new int[7][7];

        // 7x7 격자 입력 받기
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        T.BFS(0, 0); // (0,0)에서 시작

        // 결과 출력
        if (dis[6][6] == 0) System.out.println(-1); // 도착할 수 없는 경우
        else System.out.println(dis[6][6]); // 최단 거리 출력
    }
}
