package com.bj.coding;

import java.io.*;
import java.util.*;


public class BJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>(); // 큐 구현을 위한 덱 사용

        int N = Integer.parseInt(br.readLine()); // 명령어 개수

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    queue.addLast(Integer.parseInt(command[1])); // 큐의 뒤에 삽입
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.pollFirst()).append("\n"); // 큐의 앞에서 꺼내기
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peekFirst()).append("\n"); // 큐의 앞 요소 확인
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peekLast()).append("\n"); // 큐의 뒤 요소 확인
                    }
                    break;
            }
        }
        System.out.print(sb); // 결과 출력
    }
}
