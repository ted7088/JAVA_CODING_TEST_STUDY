package com.example.coding;

import java.io.*;
import java.util.*;

//LRU
public class Main6_4 {

	public static void main(String[] args) {

		Main6_4 T = new Main6_4();

		Scanner kb = new Scanner(System.in);

		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();
		for (int x : T.solution(s, n, arr))
			System.out.println(x + " ");
	}

	public int[] solution(int size, int n, int[] arr) {

		int[] cache = new int[size];
		for (int x : arr) {
			int pos = -1; // 위치
			for (int i = 0; i < size; i++)
				if (x == cache[i])
					pos = i; // 히트 됐으면 히트된 인덱스 값을 i로 저장
			if (pos == -1) {// miss 상황
				for (int i = size - 1; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
				cache[0] = x;
			} else {
				for (int i = pos; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
				cache[0] = x;
			}

		}

		return cache;
	}
}