package com.basic.test;

import java.util.Scanner;
import java.util.Stack;

public class MakeBigNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자입력 : ");
        String number = sc.nextLine();

        System.out.println("제거할 수 : ");
        int k = sc.nextInt();

        System.out.println("가장 큰 수 : " + solution(number, k));

        sc.close();
    }

    private static String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int removeCount = 0;

        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && removeCount < k && stack.peek() < digit) {
                stack.pop();
                removeCount++;
            }
            stack.push(digit);
        }

        // k개를 제거하지 못한 경우, 뒤에서 추가로 삭제
        while (removeCount < k) {
            stack.pop();
            removeCount++;
        }

        // 결과 생성
        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }

        return result.toString();
    }
}