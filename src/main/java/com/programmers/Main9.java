package com.programmers;


import java.util.Scanner;


public class Main9 {

    static int count=0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력 예시
        //5
        //1 1 1 1 1
        //3

        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = solution(numbers, target);
        System.out.println(result);


    }

    public static int solution(int[] numbers, int target){

        dfs(numbers,target,0,0);

        return count;
    }

    private static void dfs(int[] numbers, int target, int index, int sum) {

        if(index==numbers.length){
            if(sum==target){
                count++;
            }
            return;
        }

        dfs(numbers,target,index+1,sum+numbers[index]);
        dfs(numbers,target,index+1,sum-numbers[index]);


    }


}
