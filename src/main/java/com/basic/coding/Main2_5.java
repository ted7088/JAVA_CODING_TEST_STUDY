package com.basic.coding;

import java.util.Scanner;

public class Main2_5 {

    public int solution(int n) {

        int answer=0;

        int[] ch = new int[n+1];

        for(int i=2; i<=n;i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j]=1; //자기의 배수에 1이라는 flag를 남김
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Main2_5 T = new Main2_5();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();


        System.out.println(T.solution(n));


    }

}
