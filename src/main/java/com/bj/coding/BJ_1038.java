package com.bj.coding;

import java.util.Scanner;
import java.util.*;

public class BJ_1038 {
    static ArrayList<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            dfs(i, i);
        }

        Collections.sort(list);

        if (N >= list.size()) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(N));
        }
    }

    // current: 현재까지 만든 수
    // lastDigit: 마지막으로 추가한 자리 (다음 자리수는 이보다 작은 수만 가능)
    public static void dfs(long current, int lastDigit) {
        list.add(current);

        for (int i = 0; i < lastDigit; i++) {
            dfs(current * 10 + i, i);
        }
    }

}
