package com.basic.home;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main6_4 {
    public static int findLastPrince(int N, int K) {
        Queue<Integer> princes = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            princes.offer(i);
        }

        while (princes.size() > 1) {
            for (int i = 1; i < K; i++) {
                princes.offer(princes.poll()); // K-1번 회전
            }
            princes.poll(); // K번째 왕자 탈락
        }

        return princes.peek(); // 마지막으로 남은 왕자 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(findLastPrince(N, K));
    }
}
