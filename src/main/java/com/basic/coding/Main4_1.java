package com.basic.coding;

import java.util.HashMap;
import java.util.Scanner;

public class Main4_1 {

    public char solution(int n, String s) {
        char answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
           // System.out.println(x+" "+map.get(x));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Main4_1 T = new Main4_1();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));

    }
}
