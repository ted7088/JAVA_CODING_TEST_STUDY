package com.bj.coding;

import java.util.Scanner;
import java.util.*;

public class BJ_1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A); // A는 오름차순 정렬
        Arrays.sort(B, Collections.reverseOrder()); // B는 내림차순 정렬

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += A[i] * B[i];
        }

        System.out.println(result);
    }
}