package com.basic.coding;

import java.util.Scanner;
import java.util.Stack;

public class Main5_2 {

    public String solution(String str){

        String answer="";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x==')') {
                while (stack.pop()!='('); // 여는 괄호일떄까지 꺼낸다.
            }else{
                stack.push(x);
            }
        }
        for(int i=0; i< stack.size(); i++) answer+=stack.get(i);


        return answer;
    }




    public static void main(String[] args) {

        Main5_2 T = new Main5_2();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));

    }

}
