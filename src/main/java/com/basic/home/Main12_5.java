package com.basic.home;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //동전 종류 수
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i]=sc.nextInt();
        }
        
        int m =sc.nextInt(); //목표 금액

        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[501];

        q.offer(0);
        visited[0]=1;
        // 6. BFS 시작 - 0원부터 출발
        q.offer(0);
        visited[0] = 1; // 0원을 만드는 데 동전 0개 → 나중에 -1 할 것

        // 7. BFS 실행
        while (!q.isEmpty()) {
            int current = q.poll(); // 현재까지 만든 금액 꺼내기

            // 8. 현재 금액에 모든 동전을 하나씩 더해보기
            for (int coin : coins) {
                int next = current + coin; // 새로운 금액 계산

                // 목표 금액 초과하면 스킵
                if (next > m) continue;

                // 아직 next 금액을 만든 적 없다면
                if (visited[next] == 0) {
                    // 현재 금액을 만드는 데 사용한 동전 개수 + 1
                    visited[next] = visited[current] + 1;

                    // 새로운 금액을 큐에 추가
                    q.offer(next);
                }

                // 목표 금액에 처음 도달한 경우 → 최소 동전 수
                if (next == m) {
                    System.out.println(visited[next] - 1); // 동전 개수 출력
                    return; // 정답 출력했으므로 종료
                }
            }
        }
    }

}


