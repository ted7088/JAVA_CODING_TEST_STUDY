package com.basic.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Main7_1 {
    public static void main(String[] args) {
        Main7_1 T = new Main7_1();

        Scanner kb = new Scanner(System.in);

        T.DFS(3);



    }
    public void DFS(int n){
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.println(n+" ");
        }
    }
}
