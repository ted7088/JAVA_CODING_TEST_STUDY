package com.example.coding;
//그래프 최단거리(BFS)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7_14 {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph; //integer를 저장할 수 있는 ArrayList를 저장하는 ArrayList
    static int[] ch, dis; //방문 기록, 레벨 기록

    //1번 정점에서 각 정점으로 가는 최소 이동 간선수
    public static void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        Q.offer(v);

        while(!Q.isEmpty()) {
            int cv = Q.poll(); //큐에서 꺼낸 정점: cv
            System.out.println("cv:"+cv);

            //cv가 갈 수 있는 정점 순회
            for(int nv : graph.get(cv)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    dis[nv] = dis[cv] + 1; //cv의 레벨 +1
                    Q.offer(nv);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); //정점 개수
        m = in.nextInt(); //간선 개수
        ch = new int[n+1]; //2~n
        dis = new int[n+1]; //2~n

        graph = new ArrayList<ArrayList<Integer>>();
        //정점 개수만큼 리스트 추가
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        //단방향 그래프
        for(int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        ch[1] = 1;
        BFS(1);

        for(int i=2; i<=n; i++) {
            System.out.println( i + " : " + dis[i]);
        }

    }
}
