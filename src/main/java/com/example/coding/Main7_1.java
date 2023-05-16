package com.example.coding;
//7-1강 재귀함수 (스텍프레임)
public class Main7_1 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
       Main7_1 T=new Main7_1();
       T.DFS(3);
    }

}
