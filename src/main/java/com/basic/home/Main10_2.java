package com.basic.home;

import java.util.Map;
import java.util.Scanner;

public class Main10_2 {
    static int C, N , maxWeight = 0;
    static int[] dogs;

    public static void DFS(int index, int sum){

        if(sum>C) return;
        if(index==N){
            maxWeight= Math.max(maxWeight,sum);
        }else{
            DFS(index+1, sum+dogs[index]);
            DFS(index+1,sum);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        C=sc.nextInt();
        N=sc.nextInt();
        dogs=new int[N];

        for(int i=0; i<N; i++){
            dogs[i] = sc.nextInt();
        }

        DFS(0,0);
        System.out.println(maxWeight);


    }
}
