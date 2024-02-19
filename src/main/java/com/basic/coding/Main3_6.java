package com.basic.coding;

import java.util.Scanner;

public class Main3_6 {
    public int solution(int n) {

        int answer = 0;
        int cnt=1;

        n--;

        while (n>0){
            cnt++;

            n=n-cnt;
            if(n%cnt ==0 )  answer++;

        }

        return answer;

    }

    public static void main(String[] args) {

        Main3_6 T = new Main3_6();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.print(T.solution(n));
    }

}
