package com.bj.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1014 {
    static int[] matchA, matchB;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    private static boolean bipartiteMatch(int a) {
        if (visited[a]) {
            return false;
        }
        visited[a] = true;
        for (int b : adj.get(a)) {
            if (matchB[b] == -1 || bipartiteMatch(matchB[b])) {
                matchA[a] = b;
                matchB[b] = a;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;
        StringTokenizer st;

        int t, n, m, i, j, k, brokenDesk, idx, matchCnt;
        char[] deskA, deskB;

        // 테스트 케이스
        str = br.readLine();
        t = Integer.parseInt(str);
        for (i = 0; i < t; i++) {

            // 책상 정보 저장
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            deskA = new char[n * (m + 1) / 2];
            deskB = new char[n * m / 2];
            brokenDesk = 0;
            for (j = 0; j < n; j++) {
                str = br.readLine();
                for (k = 0; k < m; k++) {
                    if (k % 2 == 0) {
                        deskA[(k / 2) * n + j] = str.charAt(k);
                    } else {
                        deskB[(k / 2) * n + j] = str.charAt(k);
                    }
                    if (str.charAt(k) == 'x') {
                        brokenDesk++;
                    }
                }
            }

            // 간선 잇기
            adj.clear();
            for (j = 0; j < n * (m + 1) / 2; j++) {
                adj.add(new ArrayList<>());
            }
            for (j = 0; j < n; j++) {
                for (k = 0; k < m; k += 2) {
                    idx = (k / 2) * n + j;
                    if (deskA[idx] == '.') {
                        if (k - 1 >= 0) {
                            if (j - 1 >= 0) {
                                if (deskB[idx - n - 1] == '.') {
                                    adj.get(idx).add(idx - n - 1);
                                }
                            }
                            if (deskB[idx - n] == '.') {
                                adj.get(idx).add(idx - n);
                            }
                            if (j + 1 < n) {
                                if (deskB[idx - n + 1] == '.') {
                                    adj.get(idx).add(idx - n + 1);
                                }
                            }
                        }
                        if (k + 1 < m) {
                            if (j - 1 >= 0) {
                                if (deskB[idx - 1] == '.') {
                                    adj.get(idx).add(idx - 1);
                                }
                            }
                            if (deskB[idx] == '.') {
                                adj.get(idx).add(idx);
                            }
                            if (j + 1 < n) {
                                if (deskB[idx + 1] == '.') {
                                    adj.get(idx).add(idx + 1);
                                }
                            }
                        }
                    }
                }
            }

            // 이분 매칭
            matchA = new int[n * ((m + 1) / 2)];
            matchB = new int[n * (m / 2)];
            visited = new boolean[n * ((m + 1) / 2)];
            Arrays.fill(matchA, -1);
            Arrays.fill(matchB, -1);
            matchCnt = 0;
            for (j = 0; j < n * ((m + 1) / 2); j++) {
                Arrays.fill(visited, false);
                if (bipartiteMatch(j)) {
                    matchCnt++;
                }
            }

            // 출력
            sb.append(n * m - brokenDesk - matchCnt).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}
