package com.basic.coding;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7_8 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e){


        return 0;
    }
    public static void main(String[] args) {
        Main7_8 T = new Main7_8();

        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s,e));
    }

}

