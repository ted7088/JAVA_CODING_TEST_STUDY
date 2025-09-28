package com.bj.coding;

import java.util.*;

public class BJ_10825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        // 학생 정보를 저장할 리스트
        List<Student> students = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int korean = scanner.nextInt();
            int english = scanner.nextInt();
            int math = scanner.nextInt();
            students.add(new Student(name, korean, english, math));
        }

        // 정렬
        Collections.sort(students);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.name).append("\n");
        }
        System.out.println(sb);
    }

    // 학생 클래스
    static class Student implements Comparable<Student> {
        String name;
        int korean, english, math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student other) {
            // 정렬 기준 설정
            if (this.korean != other.korean) {
                return other.korean - this.korean; // 국어 점수 내림차순
            }
            if (this.english != other.english) {
                return this.english - other.english; // 영어 점수 오름차순
            }
            if (this.math != other.math) {
                return other.math - this.math; // 수학 점수 내림차순
            }
            return this.name.compareTo(other.name); // 이름 사전 순 오름차순
        }
    }
}
