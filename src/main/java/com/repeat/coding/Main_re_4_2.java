package com.example.coding;

import java.io.*;
import java.util.*;
public class Main_re_4_2 {

    public String solution(String str1,String str2) {

        String answer="YES";

        HashMap<Character, Integer> map =new HashMap<>();

        for(char x:str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
            System.out.println(x+":"+map.get(x));
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        for(char x:str2.toCharArray()) {
            if(!map.containsKey(x)||map.get(x)==0) answer= "NO";
            map.put(x, map.get(x)-1);
            System.out.println(x+":"+map.get(x));
        }

        return answer;

    }

    public static void main(String[] args) {

        Main_re_4_2 T = new Main_re_4_2();

        Scanner sc = new Scanner(System.in);


        String str1 = sc.next();

        String str2 = sc.next();


        System.out.println(T.solution(str1,str2));
    }

}