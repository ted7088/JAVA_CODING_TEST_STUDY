package com.programmers;

import java.util.Scanner;

public class Main_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int Max = 40;

        int[] count0 = new int[Max+1];
        int[] count1 = new int[Max+1];

        count0[0] = 1; count1[0] = 0; // fibonacci(0)
        count0[1] = 0; count1[1] = 1; // fibonacci(1)

        // 동적 계획법(반복문)으로 미리 계산
        for (int i = 2; i <= Max; i++) {
            count0[i] = count0[i - 1] + count0[i - 2];
            count1[i] = count1[i - 1] + count1[i - 2];
        }

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            System.out.println(count0[N] + " " + count1[N]);
        }

        sc.close();

    }

}
