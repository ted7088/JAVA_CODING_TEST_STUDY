package com.basic.home;

import java.util.*;

class Lecture implements Comparable<Lecture>{

    int money,day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }
    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}
public class Main11_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Lecture> lectures = new ArrayList<>();

        int maxDay=0;
        for(int i=0; i<N;i++){
            int money = sc.nextInt();
            int day = sc.nextInt();
            lectures.add(new Lecture(money,day));
            maxDay = Math.max(maxDay, day);
        }
        // 강연 가능한 날짜(day) 기준 내림차순 정렬
        Collections.sort(lectures);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 최대 강연료가 높게 만듬
        int totalIncome = 0;
        int j = 0;

        // 가장 늦은 날짜부터 역순으로 진행
        for (int i = maxDay; i > 0; i--) {
            // 현재 날짜(i)까지 할 수 있는 강연을 우선순위 큐에 추가
            while (j < N && lectures.get(j).day >= i) {
                pq.offer(lectures.get(j).money); // 강연료 추가
                j++;
            }
            // 가장 높은 강연료 선택
            if (!pq.isEmpty()) {
                totalIncome += pq.poll();
            }
        }

        System.out.println(totalIncome); // 최대로 벌 수 있는 수입 출력
    }
}