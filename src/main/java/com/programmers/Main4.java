package com.programmers;

public class Main4 {
    public String solution(String rsp){
        StringBuilder result = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                result.append('0'); // 가위 → 바위
            } else if (c == '0') {
                result.append('5'); // 바위 → 보
            } else if (c == '5') {
                result.append('2'); // 보 → 가위
            }
        }

        return result.toString();

    }
}
