package com.example.coding;

public class Node {
    public int data;
    public Node lt;
    public Node rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
