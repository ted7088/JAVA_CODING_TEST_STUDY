package com.bj.coding;
import java.util.Scanner;


public class BJ_25306 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();

        long result = start;
        // 임의의 작은 값(10)까지는 일일이 계산
        // 이로써 4의 배수 찾는 과정에서 중복될 일이 없음
        if(end - start <= 10) {
            for(long i = start + 1 ; i <= end ; i ++) {
                result ^= i;    // xor계산
            }
        } else {
            for(long i = start + 1 ; i <= end ; i ++) {
                if(i % 4 == 0) break;
                result ^= i;
            }
            for(long i = end ; i >= start ; i --) {
                if(i % 4 == 3) break;
                result ^= i;
            }
        }

        System.out.println(result);
    }
}
