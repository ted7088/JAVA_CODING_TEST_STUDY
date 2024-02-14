package com.basic.coding;

import java.util.Scanner;

public class Main3_1 {
    public int solution(int n,int m, int[][] arr) {

        int answer = 0;



        return answer;

    }

    public static void main(String[] args) {

        Main3_1 T = new Main3_1();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n,m,arr));
    }

}
