package com.repeat.coding;



public class Main_re_7_1 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Main_re_7_1  T=new  Main_re_7_1();
        T.DFS(3);
    }
}
