package com.example.coding;

import java.util.Scanner;
import java.util.Stack;

public class Main5_1 {

	public static void main(String[] args) {
		Main5_1 T = new Main5_1();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));
	}


	public String solution(String str) {

		Stack<Character> stack = new Stack<>();

		String answer = "YES";
		for(char x : str.toCharArray()){
			if(x == '(') stack.push(x);
			else{
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

}