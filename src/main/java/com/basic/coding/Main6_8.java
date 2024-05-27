package com.basic.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main6_8 {

    public int solution(int n, int m, int[] arr) {

        int answer = 0;

        Arrays.sort(arr);

        int lt = 0, rt = n - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) rt = mid - 1;
            else lt = mid+1;

        }
        return answer;
    }


    public static void main(String[] args) {
        Main6_8 T = new Main6_8();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));


    }
}
