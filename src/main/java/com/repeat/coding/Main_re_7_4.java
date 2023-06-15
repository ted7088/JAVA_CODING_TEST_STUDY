package com.repeat.coding;

import com.example.coding.Main7_4;
import com.example.coding.Node;

public class Main_re_7_4 {
    static int[] fibo;// 배열을 선언해서 담아줌 (1차적인 시간복잡도 개선)

    public int DFS(int n){

        if(fibo[n]>0) return fibo[n];// 메모제이션 활용 (시간복잡도 줄여버리기) 기존에 계산해둔 것을 활용해서 리턴해줌 ->2차적 개선

        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args) {
        Main_re_7_4 T = new Main_re_7_4();
        int n=45;
        fibo=new int[n+1];
        T.DFS(n);
        for(int i=1;i<=n;i++) System.out.print(fibo[i]+" ");
    }
}
