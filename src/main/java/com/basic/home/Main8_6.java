package com.basic.home;

import java.util.Arrays;
import java.util.Scanner;

public class Main8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] heights = new int[N];

        for(int i=0; i<N; i++){
            heights[i]= sc.nextInt();
        }



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
