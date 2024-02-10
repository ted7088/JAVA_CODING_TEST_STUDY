package com.basic.coding;

import java.util.Scanner;

public class Main2_8 {


    public int[] solution(int n, int[] arr) {

        int[] answer=new int[n];

        for(int i=0; i<n; i++){
            int cnt=1;

            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]) cnt++;//
            }
            answer[i]=cnt;
        }


        return answer;

    }

    public static void main(String[] args) {

        Main2_8 T = new Main2_8();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int x:T.solution(n,arr)) System.out.println(x+" ");

    }

}
