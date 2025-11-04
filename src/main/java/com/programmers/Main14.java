package com.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main14 {
    public int solution(int[] nums) {

        //종류 수

        Set<Integer> kinds = new HashSet<>();
        for (int n : nums) {
            kinds.add(n);
        }

        //가져 갈 수 있는 최대 마리 수
        int limit = nums.length/2;


        return  Math.min(kinds.size(), limit);

    }
}
