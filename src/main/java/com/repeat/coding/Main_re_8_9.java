package com.repeat.coding;

import java.util.Scanner;

//조합 구하기
public class Main_re_8_9 {

    static int n;
    static int m;
    static int[] combi;

    public void DFS(int L, int s){
        if(L==m){
            for(int x:combi) System.out.print(x + " ");
            System.out.println();


        }else{
            for(int i=s; i<=n; i++){
                combi[L]=i;
                DFS(L+1,i+1);
            }
        }

    }




    public static void main(String[] args) {
        Main_re_8_9 T = new Main_re_8_9();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        m=kb.nextInt();

        combi=new int[m];


        T.DFS(0,1);


    }

}