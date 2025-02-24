package com.basic.home;

import java.util.*;

public class Main6_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();  // 환자 수
        int M = sc.nextInt();  // M번째 환자 위치
        int[] risks = new int[N];

        for (int i = 0; i < N; i++) {
            risks[i] = sc.nextInt();
        }

        // 결과 출력
        System.out.println(findTreatmentOrder(N, M, risks));

        sc.close();
    }

    // 진료 순서를 찾는 함수
    public static int findTreatmentOrder(int N, int M, int[] risks) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // 환자 정보 저장
        for (int i = 0; i < N; i++) {
            queue.offer(new int[]{i, risks[i]});  // (환자 위치, 위험도)
            priorityQueue.offer(risks[i]); // 우선순위 큐에 위험도 추가
        }

        int count = 0; // 진료 순서

        // 진료 과정 시작
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 환자
            int index = current[0];
            int risk = current[1];

            // 현재 위험도가 가장 높으면 진료
            if (risk == priorityQueue.peek()) {
                count++;
                priorityQueue.poll(); // 우선순위 큐에서 제거

                // M번째 환자라면 순서 출력 후 종료
                if (index == M) {
                    return count;
                }
            } else {
                // 위험도가 더 높은 환자가 있으면 다시 줄 서기
                queue.offer(current);
            }
        }

        return -1; // 이론적으로 도달하지 않는 부분 (안전장치)
    }
}