package com.programmers;

import java.util.Scanner;

public class Main10 {
    static boolean[] visited;
    static int[][] computers;
    static int n;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();

        computers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                computers[i][j] = sc.nextInt();
            }
        }

        visited = new boolean[n];

        int networkCount=0;

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                dfs(i);
                networkCount++;
            }
        }



    }

    static void dfs(int idx){
        visited[idx] = true;

        for (int i = 0; i < n; i++) {
            if(computers[idx][i]==1 && !visited[i]){
                dfs(i);
            }
        }


    }
}
