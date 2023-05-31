package com.example.coding;
//이진수 출력 (재귀)
public class Main7_2 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }

    public static void main(String[] args) {
        Main7_2 T = new Main7_2();
        T.DFS(11);
    }
}
