package com.example.coding;

import java.io.*;
import java.util.*;

//좌표정렬
public class Main6_7 {

	public static void main(String[] args) {

		Main6_7 T = new Main6_7();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		ArrayList<Point> arr=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int x=kb.nextInt();
			int y=kb.nextInt();
			
			arr.add(new Point(x,y));
		}
		Collections.sort(arr);
		for(Point o:arr) System.out.println(o.x+" "+o.y);
	}

}

