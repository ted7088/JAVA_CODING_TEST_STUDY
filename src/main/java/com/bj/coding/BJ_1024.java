package com.bj.coding;

import java.util.Scanner;

public class BJ_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong(); // 목표 합
        int L = sc.nextInt();   // 최소 길이

        boolean found = false;

        for (int k = L; k <= 100; k++) {
            long temp = 2 * N - k * (k - 1);
            if (temp < 0) break; // x가 음수가 될 수 없으므로 탈출

            if (temp % (2 * k) == 0) {
                long x = temp / (2 * k); // 수열 시작 값
                for (int i = 0; i < k; i++) {
                    System.out.print((x + i) + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}