package com.repeat.coding;

import java.util.HashMap;
import java.util.Scanner;

public class Main_re_4_4 {

    public static void main(String[] args) {

        Main_re_4_4 T = new Main_re_4_4();

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(T.solution(a, b));
    }


    public int solution(String a,String b) {


        int answer=0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x:b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        System.out.println(bm);

        int L=b.length()-1;

        for(int i=0;i<L;i++)am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);

        System.out.println(am);



        return answer;

    }

}