package com.programmers;

public class Main2 {

    public int solution(int num1, int num2){
        return num1%num2;
    }
    public static void main(String[] args) {

        Main2 sol =new Main2();
        System.out.println(sol.solution(3,2));
        System.out.println(sol.solution(10,5));
    }
}
