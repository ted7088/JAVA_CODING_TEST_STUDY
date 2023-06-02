package com.repeat.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_7_14 {

    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch,dis;  //방문 기록, 레벨 기록

    public static void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        ch[v]=1;
        dis[v]=0;
        Q.offer(v);

        while (!Q.isEmpty()){
            int cv = Q.poll();//큐에서 꺼낸 정점

            for(int nv : graph.get(cv)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    dis[nv]=dis[cv]+1;
                    Q.offer(nv);
                }
            }


        }

    }

    public static void main(String[] args) {
        Main_re_7_14 T = new Main_re_7_14();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n+1];
        dis= new int[n+1];

        graph=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        //단방향 그래프
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }

        ch[1]=1;
        BFS(1);

        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }
}
