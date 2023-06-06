package com.repeat.coding;

import java.util.Scanner;

public class Main_re_8_3 {
    static int answer=0;
    static int m,n;
    public void DFS(int L, int sum, int time,int a[],int b[]){

        if(time>m) return;
        if(L==n) {
            answer=Math.max(answer,sum);
        }
        else{
            DFS(L+1,sum+a[L],time+b[L],a,b);
            DFS(L+1,sum,time,a,b);
        }

    }

    public static void main(String[] args) {
        Main_re_8_3 T = new Main_re_8_3();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();

        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++) {
            a[i]=kb.nextInt();
            b[i]=kb.nextInt();
        }
        T.DFS(0,0,0,a,b);

        System.out.println(answer);
    }
}
