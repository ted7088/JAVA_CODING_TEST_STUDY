package com.bj.coding;

import java.io.*;
import java.util.Arrays;

public class BJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력 숫자의 개수

        int[] arrays = new int[N];

        for(int i = 0; i < N; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(arrays); //정렬

        for(int i = 0; i < N; i++) {
            bw.write(arrays[i] + "\n"); //정렬된 배열을 순서대로 꺼내 buffer에 씀
        }

        bw.flush();
        bw.close();

    }

}
