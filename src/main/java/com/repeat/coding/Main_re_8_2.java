package com.repeat.coding;

import java.util.Scanner;

public class Main_re_8_2 {

    static int c, n;
    static int sum=0;
    static int answer=0;

    public void DFS(int L,int sum, int[] arr){
        if(sum>c)return;
        if(L==n){
            answer=Math.max(sum,answer);
        }else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }

    }

    public static void main(String[] args) {
        Main_re_8_2 T = new Main_re_8_2();
        Scanner kb = new Scanner(System.in);

        c=kb.nextInt();
        n=kb.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        T.DFS(0,0,arr);

        System.out.println(answer);

    }
}
