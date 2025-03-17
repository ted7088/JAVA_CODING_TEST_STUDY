package com.basic.home;

import java.util.Scanner;

public class Main10_1 {

    static int n, total=0;
    static int[] arr;
    static boolean found =false;

    public static void DFS(int index, int sum){
        if(found) return;

        if(index==n){
            if(sum==(total-sum)){
                found=true;
            }
            return;
        }

        // 현재 원소를 포함하는 경우
        DFS(index + 1, sum + arr[index]);
        // 현재 원소를 포함하지 않는 경우
        DFS(index + 1, sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr = new int[n];

        for(int i =0 ; i<n; i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }

        DFS(0,0);

        System.out.println(found?"YES":"NO");

    }
}
