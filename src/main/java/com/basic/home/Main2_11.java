package com.basic.home;

import com.basic.coding.Main2_1;

import java.util.Map;
import java.util.Scanner;

public class Main2_11 {


    public int solution(int n, int[][] arr) {

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {

                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }

                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }

        }


        return answer;

    }

    public static void main(String[] args) {

        Main2_11 T = new Main2_11();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) { //학년
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));


    }
}
