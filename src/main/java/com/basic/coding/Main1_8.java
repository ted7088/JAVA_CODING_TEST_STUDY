package com.basic.coding;

import java.util.Scanner;

public class Main1_8 {

    public String solution(String s) {

        String answer = "NO";

        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(s).reverse().toString();

        if (s.equals(tmp)) answer = "YES";


        return answer;
    }

    public static void main(String[] args) {

        Main1_8 T = new Main1_8();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));


    }

}
