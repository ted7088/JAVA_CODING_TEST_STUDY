package com.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Main11_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 벽돌 수
        Brick[] bricks = new Brick[n];

        for (int i = 0; i < n; i++) {
            int area = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            bricks[i] = new Brick(area, height, weight);
        }

        Arrays.sort(bricks); // 넓이 내림차순 정렬

        int[] dp = new int[n];
        dp[0] = bricks[0].height;
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            int maxHeight = 0;
            for (int j = 0; j < i; j++) {
                // 무게 조건 체크
                if (bricks[j].weight > bricks[i].weight) {
                    maxHeight = Math.max(maxHeight, dp[j]);
                }
            }
            dp[i] = maxHeight + bricks[i].height;
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }


}
class Brick implements Comparable<Brick> {
    int area, height, weight;

    public Brick(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    // 넓이 내림차순 정렬
    @Override
    public int compareTo(Brick o) {
        return o.area - this.area;
    }
}

