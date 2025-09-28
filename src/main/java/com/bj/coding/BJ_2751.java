package com.bj.coding;
import java.util.Random;
import java.util.Scanner;
public class BJ_2751 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 입력받을 수의 개수
        int[] numbers = new int[n];

        // 숫자 입력 받기
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 퀵 정렬 수행 (랜덤 피벗)
        quickSort(numbers, 0, n - 1);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.print(sb);
    }

    // 랜덤 피벗 퀵 정렬 함수
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) return;

        // 랜덤한 피벗 인덱스 선택 후 첫 번째 요소와 교환
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        swap(array, left, pivotIndex); // 피벗을 첫 위치로 이동

        int pivot = array[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= right && array[i] <= pivot) i++;
            while (j > left && array[j] >= pivot) j--;

            if (i < j) {
                swap(array, i, j);
            }
        }

        // 피벗을 올바른 위치로 이동
        swap(array, left, j);

        // 왼쪽 부분과 오른쪽 부분 재귀적으로 정렬
        quickSort(array, left, j - 1);
        quickSort(array, j + 1, right);
    }

    // 배열의 두 요소를 교환하는 함수
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
