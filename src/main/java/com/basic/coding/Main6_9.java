package com.basic.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Main6_9 {

    public static void main(String[] args) {
        Main6_9 T = new Main6_9();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }


        System.out.println(T.solution(n, m, arr));

    }

    private int solution(int n, int m, int[] arr) {

        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }
            else {
                lt=mid+1;
            }
        }

        return answer;
    }

    public int count(int[] arr , int capacity) {
        int cnt = 1;  //dvd 장수
        int sum = 0;  //노래가 얼마나 저장되어 있는지 차지하고 있는 용량

        for (int x : arr) {
            if (sum + x > capacity) { //용량을 초과해버리면
                cnt++; //새로운 장수가 필요함
                sum = x;
            } else sum += x;
        }
        return cnt;

    }
}
