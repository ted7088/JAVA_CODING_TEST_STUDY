package com.repeat.coding;

import com.example.coding.Main6_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main_re_6_9 {
    public static void main(String[] args) {

        Main_re_6_9 T = new Main_re_6_9();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt=mid+1;

        }

        return answer;
    }

    public int count(int[] arr, int capacity) {

        int cnt=1;
        int sum=0;

        for(int x:arr) {
            if(sum+x>capacity) {
                cnt++;
                sum=x;
            }
            else {
                sum+=x;
            }
        }
        return cnt;
    }
}
