package com.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_18 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        graph = new ArrayList[N+1];

        for (int i = 0; i <=N; i++) {
            graph[i]=new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);

        }

        for (int i = 0; i <=N; i++) {
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

}
