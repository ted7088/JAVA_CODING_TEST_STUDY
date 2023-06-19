package com.repeat.coding;

import com.example.coding.Main6_10;

import java.util.Arrays;
import java.util.Scanner;

public class Main_re_6_10 {
    public static void main(String[] args) {

        Main_re_6_10 T = new Main_re_6_10();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int c = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }

    public int solution(int n, int c, int[] arr) {
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while(lt<=rt) {
            int mid=(lt+rt)/2;
            if(count(arr,mid)>=c) {
                answer=mid;
                lt=mid+1;
            }
            else {
                rt=mid-1;
            }
        }
        return answer;
    }

    public int count(int[] arr, int dist) {

        int cnt=1;
        int ep=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]-ep>=dist) {
                System.out.println("ep:"+ep);
                cnt++;
                ep=arr[i];
            }
        }
        System.out.println(cnt);
        return cnt;
    }
}
