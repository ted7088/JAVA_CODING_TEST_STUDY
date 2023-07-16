package com.repeat.coding;

import com.example.coding.Main6_2;

import java.util.Scanner;

public class Main_re_6_2 {

    public static void main(String[] args) {

        Main_re_6_2 T = new Main_re_6_2();

        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++) arr[i]=kb.nextInt();
        for(int x:T.solution(n ,arr)) System.out.println(x+" ");
    }

    public int[] solution(int n, int[] arr) {

        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        return arr;
    }
}
