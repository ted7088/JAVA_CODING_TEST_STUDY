package com.repeat.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_8_11 {

    static int n,m;
    static int board[][];
    static int dis[][];
    static int dx[]={-1,0,1,0};
    static int dy[]={0,1,0,-1};


    public void BFS(int x, int y){
        Queue<Point11> Q = new LinkedList<>();

        Q.offer(new Point11(x,y));

        board[x][y]=1; //출발점 체크

        while(!Q.isEmpty()){
            Point11 tmp = Q.poll();
            for (int i=0;i<4;i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];

                if(nx>=1 && nx<=7 && ny>=1 &&ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    Q.offer(new Point11(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }

            }
        }

    }

    public static void main(String[] args) {
        Main_re_8_11 T =new Main_re_8_11();
        Scanner sc = new Scanner(System.in);
        board=new int[8][8];
        dis=new int[8][8];

        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                board[i][j]=sc.nextInt();
            }
        }
        T.BFS(1,1); //출발점
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);

    }
}
class Point11{
    public int x,y;
    Point11(int x, int y){
        this.x=x;
        this.y=y;
    }
}
