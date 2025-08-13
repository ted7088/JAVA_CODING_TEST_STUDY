package com.inflearn;

import java.util.Scanner;

public class Main9_2 {
    static int C; //트럭 제한무게
    static int N; // 바둑이 수
    static int[] dogs; // 각 바둑이 무게
    static int maxWeight=0; //가장 무거운 무게

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        C=sc.nextInt();
        N=sc.nextInt();

        dogs=new int[N];

        for (int i = 0; i < N; i++) {
            dogs[i]=sc.nextInt();
        }

        dfs(0,0);

        System.out.println(maxWeight);
    }

    public static void dfs(int L , int sum){
        if(sum>C) return;
        if (L == N) {
            maxWeight=Math.max(maxWeight, sum);
        }else{
            dfs(L+1, sum+dogs[L]);
            dfs(L+1, sum);
        }

    }


}
