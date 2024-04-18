package com.basic.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6_1 {

    public int[] solution(int n, int[] arr) {

        for(int i = 0; i<n-1; i++){
            int idx=i;

            for(int j=i+1; j <n; j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;

        }

        return arr;
    }
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Main6_1 T = new Main6_1();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }

        printArray(T.solution(n,arr));
    }
}
