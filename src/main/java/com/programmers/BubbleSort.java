package com.programmers;

import java.util.HashSet;
import java.util.Set;

public class BubbleSort {
    public static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swap = false;
            for (int j = 0; j<n-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    swap=true;
                }
            }
            if (!swap) break; // 조기 종료
        }
    }

}
