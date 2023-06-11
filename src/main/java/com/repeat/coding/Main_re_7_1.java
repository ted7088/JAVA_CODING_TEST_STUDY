package com.repeat.coding;

import com.example.coding.Main7_1;
import com.example.coding.Main7_3;

public class Main_re_7_1 {
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
