package com.basic.home;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main5_7 {

    public static void main(String[] args) {

        Main5_7 T = new Main5_7();
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));

    }


    public String solution(String need, String plan) {

        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();

        for (char x : need.toCharArray()) Q.offer(x);
        for(char x:plan.toCharArray()){
            if (Q.contains(x)) {
                if(x!=Q.poll()) return "NO";
            }
        }

        if(!Q.isEmpty()) return "NO";

        return answer;

    }
}
