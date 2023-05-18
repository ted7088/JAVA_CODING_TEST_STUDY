package com.example.coding;
//피보나치 재귀(메모이제이션)
public class Main7_4 {
    public int DFS(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);

    }

    public static void main(String[] args) {
        Main7_4 T = new Main7_4();
        int n=10;
        System.out.println(T.DFS(n));


    }
}
