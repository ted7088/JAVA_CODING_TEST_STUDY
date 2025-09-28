package com.inflearn;

import java.util.Scanner;

public class Main11_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        scanner.close();

        // 계단 수가 3 미만일 경우 예외처리 (문제 조건 상 필요 없지만 안정성 위해 작성)
        if (n < 3) {
            System.out.println("계단 수는 3 이상이어야 합니다.");
            return;
        }

        // DP 배열 생성
        int[] dp = new int[n + 1];

        // 초기값 설정
        dp[1] = 1; // 1계단: 1가지
        dp[2] = 2; // 2계단: (1+1), (2)

        // 점화식 적용
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // 결과 출력
        System.out.println(dp[n]);
    }

}
