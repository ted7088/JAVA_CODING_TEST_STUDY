package com.example.coding;
//피보나치 재귀(메모이제이션)
public class Main7_4 {
    static int[] fibo;

    public int DFS(int n){
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args) {
        Main7_4 T = new Main7_4();
        int n=10;
        fibo=new int[n+1];
        T.DFS(n);
        for(int i=1;i<=n;i++) System.out.print(fibo[i]+" ");
    }
}
