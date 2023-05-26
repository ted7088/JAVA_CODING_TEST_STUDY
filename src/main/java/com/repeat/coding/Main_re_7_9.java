package com.repeat.coding;

import com.example.coding.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_re_7_9 {
    Node root;
    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);

        int L=0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0;i<len;i++){
                Node cur = Q.poll();
                if(cur.lt==null && cur.rt==null) return L;
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Main_re_7_9 tree = new Main_re_7_9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));

    }
}
