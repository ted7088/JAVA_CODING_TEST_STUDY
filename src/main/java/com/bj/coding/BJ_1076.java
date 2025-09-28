package com.bj.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BJ_1076 {

    public static void main(String[] args) {
        // 색상-숫자 매핑
        //매핑 일단 통해서 설정
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);

        Scanner sc = new Scanner(System.in);

        // 입력 받기
        String color1 = sc.nextLine();
        String color2 = sc.nextLine();
        String color3 = sc.nextLine();

        // 숫자로 변환
        int first = colorMap.get(color1);
        int second = colorMap.get(color2);
        int multiplier = colorMap.get(color3);

        // 값 계산
        long result = (first * 10L + second) * (long)Math.pow(10, multiplier);

        // 결과 출력
        System.out.println(result);
    }


}
