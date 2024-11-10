package com.bj.coding;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_222877 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //카드의 개수
        int t = scanner.nextInt(); //놀이의 한 회수

        String input = scanner.next();  //카드 문자열

        char[] cards = input.toCharArray();

        // t번의 라운드를 반복
        for (int round = 0; round < t; round++) {
            for (int i = 0; i < n - 1; i++) {
                if (RSP(cards[i], cards[i + 1])) {

                    char temp = cards[i];
                    cards[i] = cards[i + 1];
                    cards[i + 1] = temp;
                    i++;

                }
            }
        }

        // 결과 출력
        for (char card : cards) {
            System.out.print(card);
        }

    }
    private static boolean RSP(char a, char b) {
        // R > S, S > P, P > R
        if (a == 'R' && b == 'S') return true;
        if (a == 'S' && b == 'P') return true;
        if (a == 'P' && b == 'R') return true;
        return false;
    }

}
