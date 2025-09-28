package com.bj.coding;

import java.util.Scanner;

public class BJ_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  //설탕 무게
        int count = 0;  //봉지 개수

        while (N>=0){
            if(N%5==0){
                count+=N/5;
                System.out.println(count);
                return;
            }
            N-=3;
            count++;
        }
        System.out.println(-1);
    }
}
