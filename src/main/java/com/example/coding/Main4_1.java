package com.example.coding;

import java.io.*;
import java.util.*;
public class Main4_1 {

	public char solution(int n,String str) {
		
		char answer=0;
		
		HashMap<Character, Integer> map =new HashMap<>();
		
		for(char x:str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		
		
		int max=0;
		for(char key:map.keySet()) {
			System.out.println(key +" : "+map.get(key));
			if(map.get(key)>max) {
				max=map.get(key);
				answer=key;
			}
		}
		System.out.println(answer);

		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Main4_1 T = new Main4_1();
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		String str = sc.next();
		
		
		
		System.out.println(T.solution(n,str));
	}

}