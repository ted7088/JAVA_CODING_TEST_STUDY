package com.repeat.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main_re_5_6 {

    public static void main(String[] args) {

        Main_re_5_6 T = new Main_re_5_6();

        Scanner sc = new Scanner(System.in);

        String str=sc.next();
        System.out.println(T.solution(str));

    }


    public int solution(String str) {

        int answer=0;
        Stack<Integer> stack = new Stack<>();

        for(char x:str.toCharArray()) { // str array를 만들어 줌으로서  stack이 int 값인데 하나씩 배열로 비교 할 수 있게
            if(Character.isDigit(x)) stack.push(x-48);
            else {
                int rt=stack.pop();
                int lt=stack.pop();

                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }

        }

        answer+=stack.get(0);

        return answer;

    }

}