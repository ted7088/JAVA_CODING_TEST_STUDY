package com.programmers;

import java.util.*;

public class Main_16 {
    // q: 시도한 숫자 목록 (각 원소는 길이 5의 오름차순 배열)
    // ans: 각 시도에서 보고된 일치 개수
    // n: 숫자 범위 (1..n)
    public static int solution(int n, int[][] q, int[] ans) {
        int m = q.length;
        // 각 시도 q[i]를 비트마스크로 변환
        int[] qMask = new int[m];
        for (int i = 0; i < m; i++) {
            int mask = 0;
            for (int x : q[i]) {
                mask |= 1 << (x - 1); // 숫자 x를 비트 위치 x-1에 매핑
            }
            qMask[i] = mask;
        }

        // 조합 생성 + 검사
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = i + 1;

        int[] count = new int[1]; // 결과 카운트(참조 전달용)
        dfsCombine(nums, 0, 0, 0, qMask, ans, count);
        return count[0];
    }

    // 재귀로 조합 생성: nums 배열의 인덱스 start부터 선택
    // selectedCount: 지금까지 선택한 숫자 개수
    // selectedMask: 지금까지 선택한 숫자들의 비트마스크
    private static void dfsCombine(int[] nums, int start, int selectedCount, int selectedMask,
                                   int[] qMask, int[] ans, int[] countRef) {
        int n = nums.length;
        // 남은 숫자가 필요 개수보다 적으면 중단 (가지치기)
        if (n - start < 5 - selectedCount) return;

        if (selectedCount == 5) {
            // 모든 시도에서 일치 개수가 맞는지 확인
            for (int i = 0; i < qMask.length; i++) {
                int common = Integer.bitCount(selectedMask & qMask[i]);
                if (common != ans[i]) return; // 하나라도 불일치면 탈락
            }
            countRef[0]++; // 모든 시도를 만족하면 카운트 증가
            return;
        }

        // 선택한다
        for (int i = start; i < n; i++) {
            int val = nums[i];
            int newMask = selectedMask | (1 << (val - 1));
            dfsCombine(nums, i + 1, selectedCount + 1, newMask, qMask, ans, countRef);
        }
    }

    // 간단한 main으로 예제 테스트
    public static void main(String[] args) {
        int n1 = 10;
        int[][] q1 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {3,7,8,9,10},
                {2,5,7,9,10},
                {3,4,5,6,7}
        };
        int[] ans1 = {2,3,4,3,3};
        System.out.println(solution(n1, q1, ans1)); // 출력: 3

        int n2 = 15;
        int[][] q2 = {
                {2,3,9,12,13},
                {1,4,6,7,9},
                {1,2,8,10,12},
                {6,7,11,13,15},
                {1,4,10,11,14}
        };
        int[] ans2 = {2,1,3,0,1};
        System.out.println(solution(n2, q2, ans2)); // 출력: 5
    }
}
