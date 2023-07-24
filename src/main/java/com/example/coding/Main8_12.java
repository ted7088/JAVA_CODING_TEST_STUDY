package com.example.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8_12 {
    static int n, m;
    static int board[][];
    static int dis[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    static Queue<Point3> Q = new LinkedList<>();

    public void BFS() {
        while (!Q.isEmpty()){
            Point3 tmp =Q.poll();
            for(int i=0;i<4;i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
                    board[nx][ny]=1;  // 0일경우 체크 1로 건다
                    Q.offer(new Point3(nx,ny));  // 큐에 값을 넣고
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;  //현재 위치에서 +1을 해줌
                }
            }
        }

    }


    public static void main(String[] args) {

        Main8_12 T = new Main8_12();

        Scanner kb = new Scanner(System.in);

        m = kb.nextInt();//열
        n = kb.nextInt();//행

        board = new int[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) Q.offer(new Point3(i, j)); //익은 토마토면 큐에다가 담아줌 : 0레벨
            }
        }
        T.BFS();
        boolean flag =true; //익지 않는 토마토를 위해 flag를 잡아둠
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==0) flag=false;
            }
        }
        if(flag){
            for(int i=0; i<n; i++){
                for(int j=0; j<m;j++){
                    answer=Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }


}

class Point3 {
    public int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

}