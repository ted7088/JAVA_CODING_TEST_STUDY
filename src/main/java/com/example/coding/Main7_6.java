package com.example.coding;
//이진트리 순회(깊이 우선 탐색)

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
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Main7_6 T = new Main7_6();
        n=3;
        ch=new int[n+1];
        T.DFS(1);


    }
}
