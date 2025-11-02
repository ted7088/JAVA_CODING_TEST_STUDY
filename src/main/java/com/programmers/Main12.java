package com.programmers;

import java.util.*;

public class Main12 {

    static final int[] DR = {1, -1, 0, 0};
    static final int[] DC = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        if (maps[0][0] == 0 || maps[n-1][m-1] == 0) return -1;

        int[][] dist = new int[n][m];
        ArrayDeque<int[]> q = new ArrayDeque<>();
        dist[0][0] = 1;
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            if (r == n - 1 && c == m - 1) return dist[r][c]; // 조기 종료도 가능
            System.out.println("현재 위치: (" + r + "," + c + "), 거리: " + dist[r][c]);


            for (int d = 0; d < 4; d++) {
                int nr = r + DR[d];
                int nc = c + DC[d];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (maps[nr][nc] == 0) continue;
                if (dist[nr][nc] != 0) continue;

                dist[nr][nc] = dist[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        return -1;
    }

    // 🔍 테스트용 main (로컬에서만 사용)
    public static void main(String[] args) {
        Main12 sol = new Main12();

        int[][] test1 = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };

        int[][] test2 = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,1}
        };

        System.out.println(sol.solution(test1)); // 👉 11
        System.out.println(sol.solution(test2)); // 👉 -1
    }

}
