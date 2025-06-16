package com.bj.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1018 {
    static String[] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 행
        int M = sc.nextInt(); // 열
        sc.nextLine(); // 버퍼 비우기

        board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine();
        }

        int min = 64; // 8x8 최대 변경 횟수

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, getRepaintCount(i, j));
            }
        }

        System.out.println(min);
    }

    // 8x8 시작 좌표 (x, y)에서 변경해야 할 칸 수 계산
    static int getRepaintCount(int x, int y) {
        String[] pattern = {"WBWBWBWB", "BWBWBWBW"};
        int count1 = 0; // 시작이 'W'인 경우
        int count2 = 0; // 시작이 'B'인 경우

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i].charAt(y + j);
                // 시작이 W인 경우 (패턴[0]부터 시작)
                if (current != pattern[i % 2].charAt(j)) {
                    count1++;
                }
                // 시작이 B인 경우 (패턴[1]부터 시작)
                if (current != pattern[(i + 1) % 2].charAt(j)) {
                    count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}
