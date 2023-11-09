package com.bj.coding;
import java.util.Scanner;
public class BJ_1330 {
    public static void main(String[] args) {
        //1330번. 두 수 비교하기
        //두 수를 비교한 결과를 출력하는 문제
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(a >= -10000 && b <= 10000){
            if(a>b)
                System.out.println(">");
            else if(a<b)
                System.out.println("<");
            else if(a==b)
                System.out.println("==");
        }else
            System.out.println("error!");
    }
}
