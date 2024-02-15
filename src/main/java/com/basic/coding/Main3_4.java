package com.basic.coding;

import java.util.Scanner;

public class Main3_4 {
    public int solution(int n, int m, int[] arr) {


        return answer;

    }

    public static void main(String[] args) {

        Main3_4 T = new Main3_4();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n,m,arr));
    }

}
