package com.basic.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // br.readLine()은 한 라인을 String으로 입력 받음
        // Integer.parseInt(<String>)은 <String>값을 int로 반환
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        int max = 0;

        // StringTokenizer는 String을 " " (공백)으로 구분하여 자름
        st = new StringTokenizer(br.readLine());

        // default 구분자가 공백인거고 다른 걸 넣을 수도 있음.
        // 예) st = new StringTokenizer("자를 문자열", "구분자");


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        double x = 0;

        for (int i = 0; i < N; i++) {
            x += arr[i] / (double)max * 100;
        }

        System.out.println(x / N);
    }
}
