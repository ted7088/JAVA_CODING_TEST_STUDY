package com.basic.home;

import java.util.Scanner;

public class Main7_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력 받기
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //버블정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.println(num + "");
        }


    }
}
