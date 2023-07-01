package com.repeat.coding;

import com.example.coding.Main6_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_re_6_7 {
    public static void main(String[] args) {

        Main_re_6_7 T = new Main_re_6_7();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        ArrayList<com.example.coding.Point> arr=new ArrayList<>();

        for(int i=0;i<n;i++) {
            int x=kb.nextInt();
            int y=kb.nextInt();

            arr.add(new com.example.coding.Point(x,y));
        }
        Collections.sort(arr);
        for(com.example.coding.Point o:arr) System.out.println(o.x+" "+o.y);
    }

}

class Point2 implements Comparable<com.example.coding.Point> {

    public int x, y;

    public Point2(int x, int y) {
        // TODO Auto-generated constructor stub
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(com.example.coding.Point o) {
        // TODO Auto-generated method stub
//		System.out.println("!!!"+o.y);
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}
