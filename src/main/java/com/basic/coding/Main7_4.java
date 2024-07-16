package com.basic.coding;

public class Main7_4 {
    public static void main(String[] args) {
        Main7_4 T = new Main7_4();
        int n = 5;

        System.out.println(T.DFS(n));
    }
    public int DFS(int n){
        if(n==1) return 1;
        else if (n==2) return 1;
        else return DFS(n-2)+DFS(n-1);

    }
}
