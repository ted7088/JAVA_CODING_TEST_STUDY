package com.basic.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] guest = new int[N][2];

        for (int i = 0; i < N; i++) {
            guest[i][0] = sc.nextInt();
            guest[i][1] = sc.nextInt();
        }
        sc.close();

        int maxGuest = getMaxGuest(N, guest);

        System.out.println(maxGuest);
    }

    private static int getMaxGuest(int N, int[][] guest) {

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            events.add(new Event(guest[i][0], 1));
            events.add(new Event(guest[i][1], -1));
        }

        events.sort((a, b) -> a.time == b.time ? a.type - b.type : a.time - b.time);

        int maxGuest =0;
        int currentGuest=0;

        for(Event event : events){
            currentGuest+=event.time;
            maxGuest=Math.max(maxGuest, currentGuest);
        }


        return 0;
    }

    static class Event {
        int time;
        int type;  //도착 1 , 출발 -1

        public Event(int time, int type) {
            this.time = time;
            this.type = type;
        }
    }


}
