package com.basic.home;

import java.util.LinkedList;
import java.util.Scanner;

public class Main8_4 {
    public static void main(String[] args) {
        Main8_4 T = new Main8_4();

        Scanner sc = new Scanner(System.in);


        int S = sc.nextInt();
        int N = sc.nextInt();

        int[] tasks = new int[N];

        for(int i=0; i <N; i++){
            tasks[i]=sc.nextInt();
        }


        lruCache(S,tasks);

    }

    private static void lruCache(int s, int[] tasks) {

        LinkedList<Integer> cache = new LinkedList<>();

        for (int task : tasks) {
            if(cache.contains(task)){
                cache.remove(Integer.valueOf(task));
            }

            if(cache.size()<5){
                cache.addFirst(task);
            }else{
                cache.removeLast();
                cache.addFirst(task);
            }
        }

        // 마지막 캐시 상태를 출력
        for (int i : cache) {
            System.out.print(i + " ");
        }

    }

}
