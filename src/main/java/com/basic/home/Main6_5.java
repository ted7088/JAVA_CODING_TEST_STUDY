package com.basic.home;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String required = sc.nextLine();
        String plan = sc.nextLine();
        sc.close();

        System.out.println(checkCoursePlan(required, plan));
    }

    private static String checkCoursePlan(String required, String plan) {

        Queue<Character> queue = new LinkedList<>();

        //주어진 수업 계획 큐에 삽입
        for (char subject : required.toCharArray()) {
            queue.offer(subject);
        }

        for (char subject : plan.toCharArray()) {
            if (!queue.isEmpty() && subject == queue.peek()) {
                queue.poll();
            }
        }


        return queue.isEmpty() ? "YES" : "NO";

    }
}
