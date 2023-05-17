package com.example.coding;

import java.io.*;
import java.util.*;

//중복확인
public class Main6_5 {

	public static void main(String[] args) {

		Main6_5 T = new Main6_5();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();
		
		System.out.println(T.solution(n, arr));
		
	}

	public String solution(int n, int[] arr) {
		
		String answer="U";
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				return "D";
			}
		}

		return answer;
	}
}