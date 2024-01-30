package com.basic.coding;

import java.util.Scanner;

public class Main1_11 {

    public String solution(String s) {


        String answer="";

        s=s+" ";
        int cnt=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
            }else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main1_11 T = new Main1_11();

        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        System.out.println(T.solution(str));


    }

}
