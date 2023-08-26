package com.repeat.coding;


import java.util.Scanner;
import java.util.Stack;

public class Main_re_5_3 {

    public static void main(String[] args) {

        Main_re_5_3 T = new Main_re_5_3();

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[][] board=new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=sc.nextInt();
            }
        }
        int m=sc.nextInt();
        int[] moves=new int[m];

        for(int i=0;i<m;i++) moves[i]=sc.nextInt();

        System.out.println(T.solution(board, moves));
    }


    public int solution(int[][] board,int[] moves) {

        int answer=0;
        Stack<Integer> stack = new Stack<>();

        for(int pos:moves) {
            for(int i=0;i<board.length;i++) {//크레인이 내려가고 있다
                if(board[i][pos-1]!=0) {//인형을 발견!
                    int tmp=board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty()&&tmp==stack.peek()) {//스택이 비어 있지 않고 스택의 값이 같은 경우
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }

        }



        return answer;

    }


}