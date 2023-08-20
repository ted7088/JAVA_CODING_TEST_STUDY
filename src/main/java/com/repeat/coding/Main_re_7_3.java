package com.repeat.coding;


public class Main_re_7_3 {
    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        Main_re_7_3 T = new Main_re_7_3();
        System.out.println(T.DFS(5));
    }
}
