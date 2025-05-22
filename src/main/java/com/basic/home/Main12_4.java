package com.basic.home;


import java.util.Arrays;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    int area, height, weight;

    public Brick(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.area - this.area;
    }
}

public class Main12_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Brick[] bricks = new Brick[n];

        for (int i = 0; i < n; i++) {
            int area = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            bricks[i] = new Brick(area, height, weight);

        }
        //넓이 기준 정렬
        Arrays.sort(bricks);

        int[] dp = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = bricks[i].height; //자기 자신만 쌓였을 경우
            for (int j = 0; j < i; j++) {
                if (bricks[i].weight < bricks[j].weight) { // 무게 조건
                    if (dp[i] < dp[j] + bricks[i].height) {
                        dp[i] = dp[j] + bricks[i].height;
                    }
                }
            }
            max = Math.max(max, dp[i]); // 최대 높이 갱신
        }
        System.out.println(max);
    }
}


