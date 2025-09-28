package com.basic.bj;

import java.util.Scanner;

public class BJ_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            int dx = x2 - x1;
            int dy = y2 - y1;
            int distSq = dx * dx + dy * dy;

            int sumR = r1 + r2;
            int diffR = r1 - r2;
            int sumRSq = sumR * sumR;
            int diffRSq = diffR * diffR;

            //메인 점과점 사이의 거리

            if (distSq == 0 && r1 == r2) {
                // 두 원이 완전히 겹침
                System.out.println(-1);
            } else if (distSq > sumRSq || distSq < diffRSq) {
                // 서로 떨어졌거나 완전히 내부에 있음
                System.out.println(0);
            } else if (distSq == sumRSq || distSq == diffRSq) {
                // 외접 또는 내접
                System.out.println(1);
            } else {
                // 두 점에서 만남
                System.out.println(2);
            }
        }

        sc.close();
    }
}
