package com.basic.coding;

import java.util.Scanner;
import java.util.Stack;

public class Main5_3 {

    public int solution(int[][] board, int[] moves) {

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][pos-1]!=0){ //인형이 발견됨
                    int tmp=board[i][pos-1]; //인형번호
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else stack.push(tmp);

                    break;//for문을 다시 돌면 안됨
                }
            }
        }


        return answer;

    }


    public static void main(String[] args) {

        Main5_3 T = new Main5_3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();

        System.out.println(T.solution(board, moves));

    }

}
