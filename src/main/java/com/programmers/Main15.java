package com.programmers;

import java.util.HashSet;
import java.util.Set;

public class Main15 {

    public int solution(int storey){

        int answer=0;

        while(storey>0){

            int digit = storey%10;
            int next = (storey/10)%10;

            if(digit>5){
                answer+=(10-digit);
                storey+=(10-digit);
            }
            else if (digit == 5) {
                if (next >= 5) {
                    answer += 5;   // 올리기 선택
                    storey += 5;  //올리기 선택
                } else {
                    answer += 5;   // 내리기 선택
                }
            }
            // 4 이하 → 그냥 내리기
            else {
                answer += digit;
            }

            storey /= 10; // 다음 자리로 이동
        }

        return answer;

    }
}
