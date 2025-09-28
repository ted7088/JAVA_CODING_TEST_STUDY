package com.basic.test;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 : ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right] =temp;
            left++;
            right--;
        }

        System.out.println("뒤집힌 문자열 : "+ new String(arr));

        sc.close();

    }
}
