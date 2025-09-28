package com.basic.home;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main9_8 {

    static int[] moves = {1, -1, 5};
    static int[] visited;
    static int s, e;


    public static int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s); // 시작점 삽입
        visited[s] = 1; // 시작점 방문 처리 (1-based, 처음 이동 횟수 1로 시작)


        while (!queue.isEmpty()) {
            int current = queue.poll(); // 현재 위치 꺼내기
            for (int move : moves) {
                int next = current + move; // 이동 후 위치
                if (next == e) return visited[current]; // 송아지 위치 도달하면 정답 반환
                if (next >= 1 && next <= 10000 && visited[next] == 0) {
                    visited[next] = visited[current] + 1; // 이동 횟수 저장
                    queue.offer(next); // 큐에 삽입하여 다음 탐색 준비
                }
            }
        }
        return -1; // 도달할 수 없는 경우 (문제에서 항상 가능하다고 가정)
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        e = sc.nextInt();
        visited = new int[10001];
        System.out.println(bfs());
    }


}
