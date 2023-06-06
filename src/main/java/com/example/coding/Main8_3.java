package com.example.coding;

import java.util.Scanner;

//최대 점수 구하기
public class Main8_3 {
    static int n;
    static int m;
    static int answer;

    public void DFS(int L,int sum,int time, int[] a,int[] b){
        if(time>m) return;
        if(n==L){
            answer=Math.max(sum,answer);
        }else{
            DFS(L+1,sum+a[L],time+b[L],a,b);
            DFS(L+1,sum,time,a,b);
        }
    }
    public static void main(String[] args) {
        Main8_3 T = new Main8_3();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n;i++){
            a[i]=kb.nextInt();
            b[i]=kb.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);

    }

}