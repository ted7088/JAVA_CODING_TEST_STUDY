package com.basic.test;

import java.util.Scanner;

public class NetworkDFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] computers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                computers[i][j] = sc.nextInt();
            }
        }
        sc.close();

        Solution solution = new Solution();
        int result = solution.solution(n, computers);
        System.out.println(result);

    }

    static class Solution {

        public int solution(int n, int[][] computers) {
            boolean[] visited = new boolean[n];  // 방문 여부 배열
            int count = 0;  // 네트워크 개수

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {  // 아직 방문하지 않은 컴퓨터 발견
                    dfs(computers, visited, i);
                    count++;  // DFS 한 번 돌 때마다 네트워크 개수 증가
                }
            }
            return count;
        }

        private void dfs(int[][] computers, boolean[] visited, int node) {
            visited[node] = true;  // 현재 노드 방문 처리
            for (int i = 0; i < computers.length; i++) {
                if (computers[node][i] == 1 && !visited[i]) {  // 연결된 노드 중 미방문 노드 탐색
                    dfs(computers, visited, i);
                }
            }
        }
    }
}
