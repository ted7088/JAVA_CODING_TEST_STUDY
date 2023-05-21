package com.example.coding;
//부분집합 구하기 (DFS)
public class Main7_6 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L==n+1){
            String tmp="";
            for(int i=1;i<=n;i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);

        }else{
            ch[L]=1; //사용하는 원소
            DFS(L+1);//왼쪽으로 뻣는 트리
            ch[L]=0; //사용하지 않는 원소
            DFS(L+1);//오른쪽으로 뻣는 트리
        }
    }

    public static void main(String[] args) {
        Main7_6 T = new Main7_6();
        n=3;
        ch=new int[n+1];
        T.DFS(1);


    }
}
