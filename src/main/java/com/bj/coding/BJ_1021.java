package com.bj.coding;
import java.io.*;
import java.util.*;

public class BJ_1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt(); // 큐의 크기
        int M = sc.nextInt(); // 뽑아내려는 숫자의 개수
        int[] targets = new int[M]; // 뽑아내려는 숫자
        for (int i = 0; i < M; i++) {
            targets[i] = sc.nextInt();
        }

        // 덱 초기화
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int count = 0; // 최소 연산 횟수

        // 숫자를 하나씩 뽑아내기
        for (int target : targets) {
            int index = 0;

            // 타겟 숫자의 인덱스 찾기
            for (int num : deque) {
                if (num == target) break;
                index++;
            }

            // 왼쪽으로 회전하는 경우와 오른쪽으로 회전하는 경우 비교
            int leftRotations = index;
            int rightRotations = deque.size() - index;

            // 최소 회전 선택
            if (leftRotations <= rightRotations) {
                // 왼쪽으로 회전
                for (int i = 0; i < leftRotations; i++) {
                    deque.addLast(deque.pollFirst());
                }
                count += leftRotations;
            } else {
                // 오른쪽으로 회전
                for (int i = 0; i < rightRotations; i++) {
                    deque.addFirst(deque.pollLast());
                }
                count += rightRotations;
            }

            // 첫 번째 숫자 제거
            deque.pollFirst();
        }

        // 결과 출력
        System.out.println(count);
    }
}
