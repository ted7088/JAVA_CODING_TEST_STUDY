package com.bj.coding;

import java.util.Scanner;

public class BJ_25305_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores=new int[n];


        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            int key=scores[i];
            int j=i-1;

            while (j>=0 && scores[j]<key){
                scores[j+1]=scores[j];
                j=j-1;
            }
            scores[j+1]=key;
        }

        System.out.println(scores[k-1]);
        
        
    }

}
