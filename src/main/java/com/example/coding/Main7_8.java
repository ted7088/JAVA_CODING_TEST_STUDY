package com.example.coding;
//이진트리 순회(넓이 우선 탐색 : 레벨 탐색) BFS
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7_8 {
    int answer=0;
    int[] dis={1,-1,5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){

        ch=new int[10001];
        ch[s]=1;
        Q.offer(s);
        int L=0;
        while (!Q.isEmpty()){
            int len=Q.size();
            for(int i=0;i<len;i++){
                int x=Q.poll();
                for(int j=0;j<3;j++){
                    int nx=x+dis[j];
                    if(nx>=1&&nx<=10000&&ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main7_8 T = new Main7_8();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s,e));

    }
}
