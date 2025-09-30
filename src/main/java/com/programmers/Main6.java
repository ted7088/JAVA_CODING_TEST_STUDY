package com.programmers;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("괄호 문자열을 입력하세요 : ");

        String s = sc.nextLine();

        boolean result = solution(s);

        System.out.println(result);

        sc.close();

    }


    public static boolean solution(String s){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else { // c == ')'
                count--;
                if (count < 0) { // ')'가 '('보다 많으면 바로 false
                    return false;
                }
            }
        }
        if (count == 0) {
            return true;  // 모든 '('와 ')'가 짝지어진 경우
        } else {
            return false; // 짝이 맞지 않은 경우
        }
    }

}
