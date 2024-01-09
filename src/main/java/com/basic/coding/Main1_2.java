package com.basic.coding;

import java.util.Scanner;

public class Main1_2 {

    public String solution(String str){

        String answer="";
        for(char x:str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1_2 T = new Main1_2();
        Scanner kb= new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
