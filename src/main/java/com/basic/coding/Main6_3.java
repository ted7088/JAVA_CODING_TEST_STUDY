package com.basic.coding;


import java.util.Scanner;

public class Main6_3 {

    public int[] solution(int n, int[] arr){

        for(int i = 1; i < n; i++){
            int tmp=arr[i];
            int j=0;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }

        return arr;

    }

    public static void main(String[] args) {
        Main6_3 T = new Main6_3();

        Scanner kb = new Scanner(System.in);

        int k= kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        for(int x : T.solution(n,arr)) System.out.print(x+" ");
    }

}