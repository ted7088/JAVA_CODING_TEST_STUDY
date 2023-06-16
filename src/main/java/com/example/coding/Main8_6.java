package com.example.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//동전교환
public class Main8_6 {
    static int n, m;
    static int[] pm,ch,arr;

    public void DFS(int L){
        if(L==m){
            for(int x:pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = 0; i < n ; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    pm[L]=arr[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main8_6 T = new Main8_6();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();

        arr = new int[n]; //나열할 수들

        for(int i=0; i<n; i++) arr[i] = kb.nextInt();

        ch = new int[n];  // 체크 변수
        pm = new int[m];  //현재 입력된 수열
        T.DFS(0);

    }

}