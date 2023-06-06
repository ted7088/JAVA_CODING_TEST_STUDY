package com.example.coding;

import java.util.Scanner;

//합이 같은 부분집합(DFS : 아마존 인터뷰)
public class Main8_1 {
    static int n, total=0;
    static String answer = "NO";
    boolean signal = false;

    public void DFS(int L, int sum, int[] arr) {
        if(L == n) {
            if(signal) return; 	// 백트래킹 하지 않고, 넘어오는 모든 재귀 종료시킴
            if(sum > total/2) return;
            if((total - sum) == sum) {
                answer = "YES";
                signal = true; 	// 백트래킹 하지 않고, 넘어오는 모든 재귀 종료시키려는 신호
            }
        }else {
            // 두 갈래로 뻗어나가기
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main8_1 T = new Main8_1();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);


    }

}