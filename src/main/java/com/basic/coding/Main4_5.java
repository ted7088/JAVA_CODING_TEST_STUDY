package com.basic.coding;

import java.util.*;

public class Main4_5 {

    public int solution(int[] arr, int n, int k) {
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                for(int l=j+1;l<n; l++ ){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt=0;

        for(int x :Tset){
            cnt++;
            if(cnt==k) return x;
        }


        return answer;
    }

    public static void main(String[] args) {

        Main4_5 T = new Main4_5();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k =kb.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n;i++){
            arr[i] =kb.nextInt();
        }
        System.out.println(T.solution(arr,n,k));


    }
}
