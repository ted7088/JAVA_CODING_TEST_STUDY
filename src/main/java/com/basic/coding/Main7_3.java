package com.basic.coding;

public class Main7_3 {
    public static void main(String[] args) {
        Main7_3 T = new Main7_3();
        System.out.println(T.DFS(5));
    }
    public int DFS(int n){
        if(n==1) return 1;
        else{
            return n*DFS(n-1);
        }

    }
}
