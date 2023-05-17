package com.example.coding;

import java.io.*;
import java.util.*;

public class Main4_3 {

	public static void main(String[] args) {
		
		Main4_3 T = new Main4_3();
		
		Scanner sc = new Scanner(System.in);
		
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] arr = new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int x:T.solution(n, k,arr)) {			
			System.out.print(x+" ");
		}

	}


	public ArrayList<Integer> solution(int n, int k, int[] arr) {
	
		
		ArrayList<Integer> answer=new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>(); 
		

		for(int i=0;i<k-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0 )+1); // 있으면 넣어주고 없으면 0으로 초기화
		}
		
		int lt=0;
		
		for(int rt=k-1; rt<n; rt++) {
			
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			
//			System.out.println(answer);
			
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]); //ㅣlt 값이 없으면 null
			
			lt++;
			
		}


		return answer;
		
	}

}