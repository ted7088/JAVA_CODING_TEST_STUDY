package com.programmers;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;



public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        System.out.print("프로세스 개수 입력: ");
        int n = sc.nextInt();

        int[] priorities = new int[n];
        System.out.println("프로세스 우선순위 입력:");
        for (int i = 0; i < n; i++) {
            priorities[i] = sc.nextInt();
        }

        System.out.print("찾고자 하는 프로세스 위치(location): ");
        int location = sc.nextInt();

        // 실행 순서 계산
        int result = solution(priorities, location);
        System.out.println("해당 프로세스 실행 순서: " + result);

        sc.close();
    }

    public static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        // 큐에 (인덱스, 우선순위) 형태로 삽입
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        int order = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curPriority = current[1];

            boolean hashigher = false;

            //큐안에 우선순위가 높은게 있는지 확인
            for (int[] q : queue) {
                if (q[1] > curPriority) {
                    hashigher = true;
                    break;
                }
            }

            if (hashigher) {
                queue.offer(current);
            } else {
                order++;
                if (current[0] == location) {
                    return order;
                }
            }
        }
        return -1;
    }
}
