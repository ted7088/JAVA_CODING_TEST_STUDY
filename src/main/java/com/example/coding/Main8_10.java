package com.example.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//조합 구하기
public class Main8_10 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board,dis;


    private static void BFS(int x , int y) {
        Queue<Point> Q = new LinkedList<Point>();
        Point point= new Point(x,y);
        Q.offer(point); //큐에 넣는다
        board[x][y] = 1; //출발

        while(!Q.isEmpty()){
            Point cv = Q.poll(); //꺼낸다 (현재 지점)

            for(int i=0; i<4; i++) {
                int nx = cv.x + dx[i];
                int ny = cv.y + dy[i];

                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] == 0) {
                    Q.offer(new Point(nx, ny)); //큐에 넣는다
                    board[nx][ny] = 1; //방문
                    dis[nx][ny] = dis[cv.x][cv.y] + 1; //거리 누적합(주의: cv가 현재지점)
                }
            }
        }
    }

    public static void main(String[] args) {
        Main8_10 T = new Main8_10();
        Scanner kb = new Scanner(System.in);

        board = new int[8][8];
        dis=new int[8][8];

        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                board[i][j]=kb.nextInt();
            }
        }

        BFS(1,1);
        if(board[7][7]==0) System.out.println(-1); //도착할 수 없는경우
        System.out.println(dis[7][7]);


    }


}