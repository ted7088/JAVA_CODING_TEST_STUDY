package com.basic.coding;

import java.util.Scanner;

public class Main1_3 {

    public String solution(String str){

        String answer="";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x :s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1_3 T = new Main1_3();

        Scanner kb= new Scanner(System.in);

        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }

}
