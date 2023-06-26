package com.repeat.coding;

import java.util.Scanner;

public class Main_re_8_7 {

    public int DFS(int n, int r){
        if(n==r || r==0) return 1;
        else return DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) {
        Main_re_8_7 T = new Main_re_8_7();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int r = kb.nextInt();

        System.out.println(T.DFS(n,r));
    }
}
