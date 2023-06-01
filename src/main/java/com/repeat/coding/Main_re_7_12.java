package com.repeat.coding;

import com.example.coding.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_7_12 {
    static int  n, m , answer=0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1;i<=n;i++){
                ch[i]=1;
                DFS(i);
                ch[i]=0;
            }
        }

    }

    public static void main(String[] args) {
        Main_re_7_12 T = new Main_re_7_12();
        Scanner kb = new Scanner(System.in);

        int m = kb.nextInt();
        int n = kb.nextInt();

        graph=new int[n+1][m+1];
        ch=new int[m];

        for(int i=0;i<m;i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS(1);

    }
}
