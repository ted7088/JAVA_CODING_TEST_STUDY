package com.basic.coding;

import java.util.Scanner;

public class Main8_1 {
    static int N;
    static int[] arr;
    static boolean flag =false;

    public static void DFS(int L,int sum1, int sum2){
        if(flag) return;
        if(L==N){
            if(sum1==sum2){
                flag=true;
            }
        }else{
            DFS(L+1,sum1+arr[L],sum2);
            DFS(L+1,sum1,sum2+arr[L]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        int totalSum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
//            totalSum += arr[i];
        }

        DFS(0, 0, 0);

        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
