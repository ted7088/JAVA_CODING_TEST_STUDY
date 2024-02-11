package com.basic.coding;

import java.util.Scanner;

public class Main2_10_2 {

    int[] dx = {-1, 0 ,1 ,0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int n , int[][] arr){

        int answer=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag=true;

                for(int k=0; k<4; k++){

                    int nx = i +dx[k];
                    int ny= i+dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;

            }
        }

        return answer;

    }

    public static void main(String[] args) {

        Main2_10_2 T = new Main2_10_2();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=kb.nextInt();
            }

        }

        System.out.println(T.solution(n, arr));

    }

}
