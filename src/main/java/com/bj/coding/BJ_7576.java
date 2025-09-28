package com.bj.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_7576 {

    static int[][] box; //사과 박스
    static int rows, cols; //행렬
    static Queue<int[]> queue = new LinkedList<>(); //bfs 탐색을 위한 큐

    static int[] dx = {0, 0, -1, 1};  //상하좌우
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        cols = Integer.parseInt(st.nextToken());
        rows = Integer.parseInt(st.nextToken());
        box = new int[rows][cols];

        //입력 받기
        for (int i = 0; i < rows; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < cols; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j});//큐에다 익은 토마토 담기
                }
            }
        }
        System.out.println(bfs());

    }

    static int bfs() {
        int days = 0; // 토마토가 모두 익는데 걸리는 시간(일수)

        while (!queue.isEmpty()) {
            int size = queue.size(); // 현재 단계에서 처리할 토마토 개수
            boolean ripened = false; // 하루 동안 익은 토마토가 있는지 여부

            // 현재 큐에 있는 모든 토마토를 처리
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll(); // 큐에서 현재 위치를 꺼냄
                int x = current[0]; // 행 위치
                int y = current[1]; // 열 위치

                // 상하좌우 탐색
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d]; // 새로운 행 위치
                    int ny = y + dy[d]; // 새로운 열 위치

                    // 범위 내에 있고, 익지 않은 토마토(0)일 경우
                    if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && box[nx][ny] == 0) {
                        box[nx][ny] = 1; // 익힌다
                        queue.add(new int[]{nx, ny}); // 익은 토마토의 위치를 큐에 추가
                        ripened = true; // 익은 토마토가 발생했음을 기록
                    }
                }
            }

            // 하루가 지나갔음
            if (ripened) days++;
        }

        // BFS 종료 후 익지 않은 토마토가 남아있는지 확인
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (box[i][j] == 0) return -1; // 익지 않은 토마토가 있다면 -1 반환
            }
        }

        return days; // 모두 익은 상태라면 걸린 일수 반환
    }
}