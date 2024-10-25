package com.basic.coding;

import java.util.Scanner;

public class Main8_6 {

    static int n, m;
    static int[] num, answer,ch;

    public void DFS(int L){
        if(L==m) {
            for(int x : answer)
                System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if(ch[i]==0){
                    ch[i]=1;
                    answer[L]=num[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main8_6 T = new Main8_6();
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        m=sc.nextInt();

        answer = new int[m];

        num = new int[n];

        for (int i = 0; i < n; i++) num[i] = sc.nextInt();

        ch = new int[n];


        T.DFS(0);

    }
}
