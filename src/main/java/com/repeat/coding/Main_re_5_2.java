package com.repeat.coding;


import com.example.coding.Main5_2;

import java.util.Scanner;
import java.util.Stack;

public class Main_re_5_2 {

    public static void main(String[] args) {
        Main_re_5_2 T = new Main_re_5_2();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }


    public String solution(String str) {

        String answer="";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                while (stack.pop()!='(');
            }else stack.push(x);
        }
        return answer;
    }



}