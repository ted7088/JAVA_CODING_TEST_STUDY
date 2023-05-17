package com.example.coding;

import java.io.*;
import java.util.*;

public class Main5_3_test {

	public static void main(String[] args) {
		
		Main5_3_test T = new Main5_3_test();
		
		Scanner kb = new Scanner(System.in);
	
		int n=kb.nextInt();
		int[][] board=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=kb.nextInt();				
			}
		}
	
		int m=kb.nextInt();
		int[] moves=new int[m];
		for(int i=0;i<m;i++) moves[i]=kb.nextInt();
		
		System.out.println(T.solution(board, moves));
	}


	public int solution(int[][] board,int[] moves) {
	
		int answer=0;
		
		Stack<Integer> stack=new Stack<>();
		//pos 크레인의 위치 position
		for(int pos:moves) {
			for(int i=0;i<board.length;i++) { //board.length 행크기
				if(board[i][pos-1]!=0) {
					int tmp=board[i][pos-1];
					board[i][pos-1]=0;//인형을 가져왔으니깐 0으로 만들어줌
					if(!stack.isEmpty()&&tmp==stack.peek()) {
						answer+=2;
						stack.pop();
					}
					else stack.push(tmp); //스택에 비어있거나 크레인이 가져온거가 같지 같지 않을 경우
					
				}
			}
		}

		

		return answer;
		
	}

}