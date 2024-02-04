package com.basic.coding;

import java.util.Scanner;

public class Main2_4_2 {

    public void solution(int n) {

        int a=1;
        int b=1;
        int c;

        System.out.print(a+" "+b+" ");

        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }

    public static void main(String[] args) {

        Main2_4_2 T = new Main2_4_2();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        T.solution(n);


    }

}
