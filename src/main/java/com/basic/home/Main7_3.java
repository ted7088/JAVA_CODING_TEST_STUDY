package com.basic.home;

import java.util.Scanner;

public class Main7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];//현재 삽입하는 값
            int j = i - 1;

            //key 보다 큰값들은 한칸씩 이동
            while (j >= 0 && arr[j] > key) {
                arr[j+1]=arr[j];
                j--;
            }

        }
    }
}
