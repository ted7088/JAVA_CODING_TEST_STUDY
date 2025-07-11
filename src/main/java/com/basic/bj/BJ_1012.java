package com.basic.bj;

import java.util.Scanner;

public class BJ_1012 {

    static int[][] field;
    static boolean[][] visited;
    static int M,N; //배추 밭 가로 세로 길이
    static int[] dx={0,0,-1,1};  //상하좌우
    static int[] dy={-1,1,0,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 0; t<T; t++){
            M=sc.nextInt();
            N=sc.nextInt();
            int K = sc.nextInt();  //배추의 개수

            field = new int[N][M];
            visited = new boolean[N][M];

            for(int i = 0; i<K;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[y][x]=1;
            }
            int worms=0;

            for(int i = 0; i<N; i++){
                for(int j = 0; j<M; j++){
                    if(field[i][j]==1&&!visited[i][j]){
                        performDFS(i,j);
                        worms++;
                    }
                }
            }
            System.out.println(worms);
        }
        sc.close();
    }

    //dfs 메소드
    static void performDFS(int x, int y){
        visited[x][y]=true;

        //상하좌우
        for(int i=0; i <4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M && field[nx][ny] == 1 && !visited[nx][ny]) {
                performDFS(nx, ny); // 인접한 배추에 대해 DFS 호출
            }
        }
    }

}
