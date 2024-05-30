package com.bj.coding;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_25309 {
    final int TYPES = 8;
    int[] status = new int[TYPES];
    int[] seq = new int[TYPES];
    boolean[] check = new boolean[TYPES];
    int count = 0;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < TYPES; i++) {
            status[i] = Integer.parseInt(st.nextToken());
        }
        seq[0] = status[0];
        check[0] = true;
    }

    void backtracking(int depth) {
        if (depth == TYPES) {
            if (isConvex(0) && isConvex(1)) count++;
            return;
        }
        for (int i = 1; i < 8; i++) {
            if (check[i]) continue;
            seq[depth] = status[i];
            if (depth < 2 || isConvex(depth)) {
                check[i] = true;
                backtracking(depth + 1);
                check[i] = false;
            }
        }
    }

    boolean isConvex(int curr) {
        int before = (curr + TYPES - 2) % TYPES;
        int middle = (curr + TYPES - 1) % TYPES;
        int next = curr % TYPES;
        double line = Math.sqrt(2) * seq[before] * seq[next] / (seq[before] + seq[next]);
        return seq[middle] > line;
    }

    void solution() throws IOException {
        input();
        backtracking(1);
        System.out.println(count * TYPES);
    }

    public static void main(String[] args) throws IOException {
        new BJ_25309().solution();
    }
}
