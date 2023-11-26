package com.bj.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class BJ_13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 다리를 건너는 트럭의 수
        int w = Integer.parseInt(st.nextToken()); // 다리의 길이
        int l = Integer.parseInt(st.nextToken()); // 다리의 최대 하중

        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        int count = 0; // 시간
        int bridgeWeight = 0; //다리의 무게

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            truck.offer(Integer.parseInt(st.nextToken())); // 트럭의 무게
        }

        for (int i = 0; i < w; i++) {
            bridge.add(0); // 다리를 모두 0으로 초기화
        }

        while (!bridge.isEmpty()) { // 다리위에 아무것도 없을 때까지
            count++;
            bridgeWeight -= bridge.poll(); // 다리무게에서 내려온 트럭 무게를 뺌
            if (!truck.isEmpty()) { // 트럭이 남아있다면
                if (truck.peek() + bridgeWeight <= l) { // 앞의 트럭이 더해져도 다리의 최대하중보다 작다면
                    bridgeWeight += truck.peek();
                    bridge.offer(truck.poll()); // 다리에 트럭 추가
                } else { // 최대 하중을 초과하면
                    bridge.offer(0); // 다리위에 아무것도 안실림
                }
            }
        }

        System.out.println(count);

    }
}
