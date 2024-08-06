package com.basic.coding;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7_14 {
    static int n, m, answer = 0;

    static ArrayList<ArrayList<Integer>> graph;

    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();

        ch[v]=1;
        dis[v]=0;
        queue.offer(v);

        while (!queue.isEmpty()){
            int cv=queue.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    queue.offer(nv);
                    dis[nv]=dis[cv]+1;

                }
            }
        }
    }


    public static void main(String[] args) {
        Main7_14 T = new Main7_14();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt(); //입력받을 수의 값
        m = kb.nextInt(); //갯수
        graph = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1];

        for(int i=0;i<m;i++){
            int a = kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2;i<=n;i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}