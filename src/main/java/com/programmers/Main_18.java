package com.programmers;

import java.util.*;

public class Main_18 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 정점 개수
        int M = sc.nextInt();  // 간선 개수
        int V = sc.nextInt();  // 시작 정점

        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        // 정점 번호가 작은 것부터 방문하려면 반드시 정렬!
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 실행
        visited = new boolean[N + 1];
        dfs(V);
        sb.append("\n");

        // BFS 실행
        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(sb.toString());
        sc.close();

    }

    //dfs
    static void dfs(int node){
        visited[node]=true;
        sb.append(node).append(" ");
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()){
            int now = q.poll();

            sb.append(now).append(" ");

            for(int next : graph[now]){
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }

}
