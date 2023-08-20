package com.repeat.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_re_8_5 {
    static int n, m;
    static int answer = Integer.MAX_VALUE;


    public void DFS(int L, int sum, Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m){
            answer=Math.min(answer,L);
        }else{
            for(int i=0;i<n;i++){
                DFS(L+1,sum+arr[i],arr);
            }
        }

    }


    public static void main(String[] args) {
        Main_re_8_5 T = new  Main_re_8_5();
        Scanner kb = new Scanner(System.in);

        n=kb.nextInt();
        Integer[] arr = new Integer[n];

        for(int i=0;i<n;i++) arr[i]=kb.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());
//        for(int x : arr ) System.out.println(x+" ");

        m=kb.nextInt();
        T.DFS(0,0,arr);
        System.out.println(answer);


    }
}
