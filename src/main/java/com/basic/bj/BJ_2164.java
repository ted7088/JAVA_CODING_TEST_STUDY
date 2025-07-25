package com.basic.bj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        sc.close();

        //큐 생성
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while (queue.size()>1){
            queue.poll(); // 카드 위 버리기
            queue.add(queue.poll());
        }


        //남은 카드 출력
        System.out.println(queue.poll());
    }
}
