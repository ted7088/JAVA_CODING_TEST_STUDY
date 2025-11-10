package com.programmers;

import java.util.HashSet;
import java.util.Set;
//버블소트 연습
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


    public int binarySearch (int arr[], int target) {

        int low = 0;
        int high = arr.length-1;


        while(low <= high) {
            int mid = low+(high-low)/2;

            if(arr[mid]==target) {
                return mid;  // 찾음
            }
            else if (arr[mid] < target) {
                low = mid + 1;  // 오른쪽 구간으로 이동
            } else {
                high = mid - 1; // 왼쪽 구간으로 이동
            }
        }
        return -1;  // 못 찾음
    }



}
