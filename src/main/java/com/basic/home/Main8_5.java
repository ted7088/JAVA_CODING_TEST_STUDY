package com.basic.home;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];

        for(int i=0; i<N; i++){
            numbers[i]=sc.nextInt();
        }

        String result = checkDuplicate(numbers);

        System.out.println(result);

        sc.close();

    }

    private static String checkDuplicate(int[] numbers) {

        Arrays.sort(numbers);

        for(int i=1; i<numbers.length; i++){
            if(numbers[i] == numbers[i-1]){
                return "D";
            }
        }
        return "U";
    }

}
