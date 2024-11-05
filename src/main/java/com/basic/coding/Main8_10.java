package com.basic.coding;

import java.util.Scanner;

public class Main8_10 {

    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int[][] board;
    static int answer=0;
    public static void DFS(int x, int y) {
        if(x==7&&y==7) answer++;
        else{
            for(int i =0;i<4; i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=1&&nx<=7&&ny>=1&&ny<=7&&board[nx][ny]==0){
                    board[nx][ny]=1;//갔으니까 1로
                    DFS(nx,ny);
                    board[nx][ny]=0; // 백트레킹 더이상 갈곳 없을 때 다시 돌아와서 하게 해줌

                }
            }
        }

    }

    public static void main(String[] args) {
        Main8_10 T = new Main8_10();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        for(int i=1; i<=7;i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }

        }
    }
}
