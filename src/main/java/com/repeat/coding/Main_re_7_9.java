package com.repeat.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_7_9 {

    private int answer=0;
    private int[] dis = {1,-1,5}; //움직일 수 있는 거리
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s,int e){

        ch = new int[10001];
        ch[s]=1;
        Q.offer(s);
        int L=0;

        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0;i<len;i++){
                int x = Q.poll();
                for(int j=0;j<3;j++){
                    int nx = x+dis[j];
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }

                }
            }
        }



        return answer;
    }
    public static void main(String[] args) {
        Main_re_7_9 T = new Main_re_7_9();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s,e));

    }
}
