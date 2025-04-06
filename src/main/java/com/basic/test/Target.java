package com.basic.test;

import java.util.Scanner;

public class Target {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0 );

        return answer;
    }

    private void dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        dfs(numbers, target, index + 1, sum + numbers[index]);
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 숫자 개수 입력
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  // 배열 입력
        }
        int target = sc.nextInt();  // 목표 숫자 입력

        Target target1 = new Target();
        int result = target1.solution(numbers, target);
        System.out.println(result);

        sc.close();
    }
}
