package com.basic.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            System.out.println("첫 줄에 배열 크기 N을 입력해야 합니다.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                // 입력이 부족하면 0으로 채우거나 종료
                arr[i] = 0;
            }
        }
        sc.close();

        List<Integer> ans = solution(arr);

        // 출력 형식: [1, 3, 0, 1] 와 같이 출력
        System.out.println(ans);
    }

    public static List<Integer> solution(int[] arr){
        List<Integer> result = new ArrayList<>();

        int prev = -1;
        for (int v : arr) {
            if (v != prev) {        // 이전 값과 다르면 결과에 추가
                result.add(v);
                prev = v;          // prev 갱신
            }
            // 이전 값과 같으면(연속 중복) 그냥 무시
        }
        return result;
    }

}
