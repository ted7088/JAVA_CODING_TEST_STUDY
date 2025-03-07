package com.basic.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();

        List<int[]> points = new ArrayList<>();
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new int[] {x, y});
        }

        sortPoints(points);
        printPoints(points);
        
        sc.close();
    }

    private static void sortPoints(List<int[]> points) {
        points.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
    }

    private static void printPoints(List<int[]> points) {
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}