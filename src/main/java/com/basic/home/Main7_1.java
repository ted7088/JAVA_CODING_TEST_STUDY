package com.basic.home;

import java.util.Scanner;

public class Main7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0 ; i<N;i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr,N);

        for(int num : arr){
            System.out.println(num+" ");
        }

        sc.close();

    }

    private static void selectionSort(int[] arr, int N) {
        for(int i=0; i<N-1; i++){
            int minIdx = i;

            for(int j=i+1; j<N; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }

            swap(arr, i, minIdx);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
