package com.basic.home;

import java.util.Scanner;

public class Main9_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10진수 n을 입력하세요 : ");

        int n = sc.nextInt();

        if(n==0){
            System.out.print(0);
        }else {
            toBinary(n);
        }
    }

    private static void toBinary(int n) {
        if(n==0){
            return;
        }
        toBinary(n/2);
        System.out.println(n%2);
    }
}
