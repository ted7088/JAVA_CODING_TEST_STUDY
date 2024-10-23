package com.basic.coding;

import java.util.Scanner;

public class Main8_5 {
    static int n,m;
//    static int[] coins;
    static int answer=Integer.MAX_VALUE;

    public void DFS(int L , int sum, int[] arr){

        if(sum>m) return;
        if(sum==m){
            answer=Math.min(answer,L);
        }else {
            for(int i=0;i<n;i++){
                DFS(L+1 , sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main8_5 T = new Main8_5();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        m=kb.nextInt();

        T.DFS(0,0,arr);
        System.out.println(answer);

    }



}
