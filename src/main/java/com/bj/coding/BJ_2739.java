package com.bj.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2739 {

    public static void main(String[] args) {

        System.out.println("입력하세요:");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        for (int i=2; i<10; i++){

            for (int j=1; j<10; j++){
                System.out.println(i+"x"+j+"="+i*j);
            }

            System.out.println("--------------------------");
        }
    }
}
