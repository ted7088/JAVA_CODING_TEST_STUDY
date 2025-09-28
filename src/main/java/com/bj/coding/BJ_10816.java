package com.bj.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 카드 입력
        int N = Integer.parseInt(br.readLine()); // 카드 수
        HashMap<Integer, Integer> cardMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine()); //문자열 받기


        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);//hashmap 사용해서 카드 개수를 1씩 증가
        }

        // 2. 찾을 카드 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(cardMap.getOrDefault(target, 0)).append(" ");
        }

        // 3. 결과 출력
        System.out.println(sb.toString().trim());
    }
}
