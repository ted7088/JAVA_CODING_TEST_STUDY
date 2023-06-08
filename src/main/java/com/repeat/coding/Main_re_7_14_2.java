package com.repeat.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_7_14_2 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph; //integer를 저장할 수 있는 ArrayList를 저장하는 ArrayList
    static int[] ch, dis; //방문 기록, 레벨 기록

    public static void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        int L=0;//레벨

        while(!Q.isEmpty()){
            int len = Q.size();

            //큐 순회
            for(int i=0;i<len;i++){
                int cv = Q.poll();

                for(int nv : graph.get(cv)){
                    if(ch[nv]==0){
                        ch[nv]=1;
                        dis[nv]=L+1;
                        Q.offer(nv);

                    }
                }
            }
            L++; //큐에 있는 순회가 끝나면 레벨 증가
        }


    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); //정점 개수
        m = in.nextInt(); //간선 개수
        ch = new int[n+1]; //2~n
        dis = new int[n+1]; //2~n

        graph =new ArrayList<ArrayList<Integer>>();
        //정점 갯수 만큼 리스트 추가
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        //단방향 그래프
        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();

            graph.get(a).add(b);
        }

        ch[1]=1;
        BFS(1);

        for(int i=2;i<=n;i++){
            System.out.println(i+" : "+dis[i]);
        }



    }
}
