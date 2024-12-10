package com.bj.coding;

import java.util.Scanner;
import java.util.Stack;

public class BJ_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스 개수
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < t; i++) {
            String ps = sc.nextLine();
            if (validString(ps)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean validString(String ps) {
        Stack<Character> stack = new Stack<>();
        for (char ch : ps.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);  // 여는 괄호는 스택에 넣는다.
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;  // 스택이 비어있으면 유효하지 않음
                }
                stack.pop();  // 여는 괄호를 닫는다.
            }
        }
        return stack.isEmpty();  // 모든 괄호가 짝을 이루었는지 확인
    }
}