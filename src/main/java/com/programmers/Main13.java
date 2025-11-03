package com.programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main13 {

    public int[] solution(int[] progress,int[] speeds){
        List<Integer> result = new ArrayList<>();

        int n = progress.length;
        int[] days = new int[n];

        for (int i = 0; i < n; i++) {
            int remain = 100 - progress[i];        // 남은 퍼센트
            int day = remain / speeds[i];            // 몫 계산
            if (remain % speeds[i] != 0) day++;      // 나머지가 있으면 하루 더 필요
            days[i] = day;
        }


        // 2. 배포 묶음 계산
        int count = 1;          // 첫 번째 기능은 무조건 하나 시작
        int prev = days[0];     // 첫 기능의 완료 일수

        for (int i = 1; i < n; i++) {
            if (days[i] <= prev) {
                // 앞의 기능보다 빨리 끝났다면, 같은 날 배포됨
                count++;
            } else {
                // 앞 기능보다 늦게 끝남 → 새 배포 그룹
                result.add(count);
                count = 1;
                prev = days[i];
            }
        }

        // 마지막 배포 묶음 추가
        result.add(count);

        // 3. 리스트 → 배열 변환 (스트림 X)
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

}
