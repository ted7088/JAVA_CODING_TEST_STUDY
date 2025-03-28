package com.basic.home;

import java.util.Arrays;
import java.util.Scanner;

public class Main11_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        sc.close();

        System.out.println(getMaxMeetings(meetings));
    }

    private static int getMaxMeetings(int[][] meetings) {
        // 끝나는 시간을 기준으로 정렬 (같으면 시작 시간 기준 정렬)
        Arrays.sort(meetings, (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEndTime = 0;

        for (int[] meeting : meetings) {
            if (meeting[0] >= lastEndTime) { //현재 회의 시작 시간이 이전 회의 끝난 시간 이후라면
                count++;
                lastEndTime = meeting[1]; //끝나는 시간 갱신
            }
        }

        return count;
    }
}
