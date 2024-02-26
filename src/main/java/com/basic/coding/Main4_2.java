package com.basic.coding;

import java.util.HashMap;
import java.util.Scanner;

public class Main4_2 {

    public String solution(String s1 , String s2) {

        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s1.toCharArray()){
            System.out.println(x);
            map.put(x,map.getOrDefault(x, 0)+1);
        }

        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.getOrDefault(x, map.get(x)-1));
        }



        return answer;
    }

    public static void main(String[] args) {

        Main4_2 T = new Main4_2();

        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();



        System.out.println(T.solution(a, b));

    }
}
