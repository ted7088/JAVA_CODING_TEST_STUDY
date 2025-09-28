package com.bj.coding;

import com.example.coding.Point;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2178 {
    static int n, m; // 미로의 크기
    static char[][] maze; // 미로 정보 (문자 그대로 저장)
    static boolean[][] visited; // 방문 여부
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1}; // 상하좌우 이동

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //미로 크기 입력
        n = sc.nextInt();
        m = sc.nextInt();

        maze = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            maze[i] = sc.next().toCharArray();
        }

        System.out.println(bfs(new Point(0,0)));


    }
    // BFS를 사용한 최단 경로 탐색
    static int bfs(Point start) {

        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        int[][] distance = new int[n][m]; //거리정보 저장
        distance[start.x][start.y]=1; //거리정보 초기화

        while (!queue.isEmpty()){
            Point current = queue.poll();

            if(current.x == n-1 && current.y==m-1){
                return distance[current.x][current.y];
            }

            //상하좌우 이동
            for(int i=0; i<4; i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m){
                    if (!visited[nextX][nextY] && maze[nextX][nextY] == '1') {
                        queue.add(new Point(nextX, nextY)); // 다음 위치를 큐에 추가
                        visited[nextX][nextY] = true; // 방문 처리
                        distance[nextX][nextY] = distance[current.x][current.y] + 1; // 거리 갱신
                    }
                }


            }

        }

        return -1;
    }
}