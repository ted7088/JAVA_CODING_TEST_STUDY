package com.repeat.coding;


public class Main_re_7_2 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }

    public static void main(String[] args) {
        Main_re_7_2 T = new Main_re_7_2();
        T.DFS(11);
    }
}
