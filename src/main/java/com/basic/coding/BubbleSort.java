package com.basic.coding;


import java.util.Scanner;
// 다시 풀어보기
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // 인접한 두 원소의 위치를 교환
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("배열의 원소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] sortedArray = bubbleSort(arr);

        System.out.println("정렬된 배열:");
        printArray(sortedArray);

        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}