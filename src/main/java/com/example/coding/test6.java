package com.example.coding;

public class test6{
public static void main(String[] args) {
	
	int i=0;
	int sum=0;
	while(i<10) {
		i++;
		if(i%2==1) continue;
		sum+=i;
	}
System.out.println(sum);
	}
}