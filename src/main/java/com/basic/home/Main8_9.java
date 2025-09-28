package com.basic.home;

import java.util.*;

public class Main8_9 {
    // DVD 개수 체크 함수
    public static int countDVDs(int[] songs, int dvdSize) {
        int count = 1, sum = 0;
        for (int song : songs) {
            if (sum + song > dvdSize) {
                count++; // 새로운 DVD 필요
                sum = song; // 새로운 DVD에 현재 노래 추가
            } else {
                sum += song;
            }
        }
        return count;
    }

    public static int minDVDSize(int n, int m, int[] songs) {
        int left = Arrays.stream(songs).max().getAsInt(); // 가장 긴 노래의 길이
        int right = Arrays.stream(songs).sum(); // 모든 노래 길이의 합
        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (countDVDs(songs, mid) <= m) { // M개 이하의 DVD로 담을 수 있으면 크기 줄이기
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 곡 개수
        int m = sc.nextInt(); // DVD 개수
        int[] songs = new int[n];

        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextInt();
        }

        System.out.println(minDVDSize(n, m, songs));
        sc.close();
    }
}