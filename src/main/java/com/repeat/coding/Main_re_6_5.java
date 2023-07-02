package com.repeat.coding;

import com.example.coding.Main6_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_re_6_5 {
    public static void main(String[] args) {

        Main_re_6_5 T = new Main_re_6_5();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.solution(n, arr));

    }

    public String solution(int n, int[] arr) {

        String answer="U";
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++) {
            if(arr[i]==arr[i+1]) {
                return "D";
            }
        }

        return answer;
    }
}
