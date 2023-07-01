package com.example.coding;

public class Point implements Comparable<Point> {

    public int x, y;

    public Point(int x, int y) {
        // TODO Auto-generated constructor stub
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // TODO Auto-generated method stub
//		System.out.println("!!!"+o.y);
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }

}
