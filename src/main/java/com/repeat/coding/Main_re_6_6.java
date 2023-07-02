package com.repeat.coding;

import com.example.coding.Main6_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_re_6_6 {
    public static void main(String[] args) {

        Main_re_6_6 T = new Main_re_6_6();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//		System.out.println("@@");

        for(int x: T.solution(n, arr)) System.out.println(x+" ");

    }

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        int[] tmp=arr.clone();
        Arrays.sort(tmp);

        for(int i=0;i<n;i++) {
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }

        return answer;
    }
}
