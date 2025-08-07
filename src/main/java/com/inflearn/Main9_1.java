package com.inflearn;

import java.util.Scanner;

public class Main9_1 {

    static String answer="NO";
    static int n,total;
    static int[] arr;
    static boolean flag = false;

    public void DFS(int L, int sum){

        if(flag) return;

        if(sum>total/2) return;

        if(L==n){
            if((total-sum) == sum){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L + 1, sum + arr[L]);  //사용함
            DFS(L + 1, sum); //사용 안함
        }

    }

    public static void main(String[] args) {

        Main9_1 T = new Main9_1();
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        total=0;

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            total+=arr[i];
        }

        T.DFS(0,0);

        System.out.println(answer);


    }

}
