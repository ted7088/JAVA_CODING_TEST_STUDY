package com.basic.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11_3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        int[][] guests =new int[N][2];

        for (int i = 0; i < N; i++) {
            guests[i][0]=sc.nextInt();
            guests[i][1]=sc.nextInt();
        }

        int maxGuest = getMaxGuest(N,guests);
        System.out.println(maxGuest);

    }

    private static int getMaxGuest(int N, int[][] guests) {

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            events.add(new Event(guests[i][0],1));
            events.add(new Event(guests[i][1],-1));
        }

        events.sort((a, b) -> a.time == b.time ? a.type - b.type : a.time - b.time);

        int maxGuests = 0;
        int currentGuests = 0;

        for (Event event : events) {
            currentGuests += event.type; // 도착하면 +1, 출발하면 -1
            maxGuests = Math.max(maxGuests, currentGuests);
        }

        return maxGuests;
    }


    static class Event{
        int time;
        int type;

        public Event(int time, int type) {
            this.time = time;
            this.type = type;
        }
    }

}
