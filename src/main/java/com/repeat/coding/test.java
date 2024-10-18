package com.repeat.coding;

public class test {

    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        test T = new test();
        System.out.println(T.DFS(5));
    }
}
