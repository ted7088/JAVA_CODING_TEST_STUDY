package com.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_19 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        char[][] floor =new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                floor[i][j] = line.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char c = floor[i][j];
                if (c == '-') {
                    // 왼쪽에 같은 '-' 가 있으면 이미 세어졌으므로 무시
                    if (j == 0 || floor[i][j - 1] != '-') {
                        count++;
                    }
                } else { // c == '|'
                    // 위에 같은 '|' 가 있으면 이미 세어졌으므로 무시
                    if (i == 0 || floor[i - 1][j] != '|') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}
