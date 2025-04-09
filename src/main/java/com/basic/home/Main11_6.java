package com.basic.home;

import java.util.Scanner;

public class Main11_6 {

    static int parent[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //학생수
        int m = sc.nextInt();  //관계 수

        initialize(n);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);// 친구 관계 묶기 메소드
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (isFriend(x, y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private static void initialize(int n) {
        parent = new int[n + 1];
        for (int i = 0; i < n; i++) {
            parent[i] = i; //각자 자기자신이 대표
        }
    }

    public static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {
            parent[rootA] = rootB;
        }
    }

    private static boolean isFriend(int a, int b) {
        return find(a)==find(b);
    }
}
