package com.basic.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Wrestler implements Comparable<Wrestler>{
    int height, weight;

    public Wrestler(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Wrestler o) {
        return o.height-this.height;
    }
}


public class Main11_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        List<Wrestler> list = new ArrayList<>();

        for(int i = 0; i<N; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();

            list.add(new Wrestler(height, weight));

        }

        //키 기준 내림차순 정렬
        Collections.sort(list);

        int maxWeight = 0;
        int count = 0;

        for (Wrestler wrestler : list) {
            if(wrestler.weight>maxWeight){
                count++;
                maxWeight= wrestler.weight;
            }
        }

        System.out.println(count);


    }

}
