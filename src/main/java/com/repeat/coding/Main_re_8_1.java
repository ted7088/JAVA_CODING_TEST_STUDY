package com.repeat.coding;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_8_1 {
    static int n;
    static int total=0;
    static  String answer ="No";
    boolean flag= false;
    public void DFS(int L, int sum, int[] arr){
        if(L==n){
            if(flag) return;
            if(sum>total/2) return;
            if((total-sum)==sum){
                answer="YES";
                flag=true;
            }

        }else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }

    public static void main(String[] args) {
        Main_re_8_1 T = new Main_re_8_1();

        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            kb.nextInt();
            total+=arr[i];
        }

        T.DFS(0,0,arr);

        System.out.println(answer);

    }
}
