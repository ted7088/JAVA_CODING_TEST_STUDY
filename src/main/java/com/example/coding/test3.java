package com.example.coding;

public class test3 {
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		int result = 0;
		
		for(int i=0;i<5;i++) {
			arr[i]=i++;
//			System.out.println(arr[i]);
			System.out.println("["+i+"]");
		}
		for(int i=0;i<5;i++) {	
			
			System.out.println(arr[i]);
		}
//		for(int i:arr) {
////			System.out.println(i);
//			result+=i;
//		}
//		System.out.println(result);
		
	}
	
}
