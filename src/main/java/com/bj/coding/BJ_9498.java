package com.bj.coding;
import java.util.Scanner;
public class BJ_9498 {
    public static void main(String[] args) {
        //9498번. 시험 성적
        //시험 점수를 성적으로 바꾸는 문제
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if(score>=0 && score<=100) {
            if (score >= 90)
                System.out.println("A");
            else if (score >= 80)
                System.out.println("B");
            else if (score >= 70)
                System.out.println("C");
            else if (score >= 60)
                System.out.println("D");
            else
                System.out.println("F");
        }
    }
}
