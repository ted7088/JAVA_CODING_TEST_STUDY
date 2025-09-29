package com.programmers;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        // TODO Auto-generated method stub

        String[] strNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {

            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            };
        });


        // 3. 예외 처리
        //    정렬된 첫 값이 "0"이면 전체가 다 "0"인 경우이므로
        //    결과는 그냥 "0"
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        //문자열 합치기

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strNumbers.length; i++) {
            sb.append(strNumbers[i]);
        }


        return sb.toString();
    }

}
