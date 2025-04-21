package com.basic.home;

import java.util.Scanner;

public class Main12_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
    }
}
