package com.repeat.coding;

import com.example.coding.Main7_2;
import com.example.coding.Main7_3;

public class Main_re_7_2 {
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
