package com.programmers;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public int solution(int[] array) {


        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mode = -1;

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, countMap.get(num));
        }


        // 2. 최빈값 확인 (최빈값이 여러 개이면 -1)
        int cntMax = 0; // 최빈값이 몇 개인지 세기
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                mode = entry.getKey();
                cntMax++;
                if (cntMax > 1) { // 최빈값이 2개 이상이면 -1
                    return -1;
                }
            }
        }

        return mode;

    }
}
