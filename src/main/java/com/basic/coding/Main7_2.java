package com.basic.coding;

import java.util.Scanner;

public class Main7_2 {
    public static void main(String[] args) {
        Main7_2 T = new Main7_2();
        T.DFS(11);

    }
    public void DFS(int n){
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2+" ");
        }

    }
}
