package com.basic.coding;

import java.util.Scanner;

public class Main1_9 {

    public int solution(String s) {

        int answer = 0;

        for(char x : s.toCharArray()){
            if(x>=48 && x <=57) answer=answer*10+(x-48);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main1_9 T = new Main1_9();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));


    }

}
