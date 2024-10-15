package com.repeat.coding;

import com.example.coding.Main8_4;

import java.util.Scanner;

//순열 조합

public class Main_re_8_4 {
    static int[] pm;
    static int n,m;
    public void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=1;i<=n;i++){
                pm[L]=i;
                DFS(L+1);
            }
        }

    }
    public static void main(String[] args) {
        Main_re_8_4  T = new Main_re_8_4 ();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];

        T.DFS(0);


    }
}
