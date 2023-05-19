package com.example.coding;
//이진트리 순회(깊이 우선 탐색)


class Node {
    int data;
    Node lt;
    Node rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main7_5 {
    Node root;

    public void DFS(Node root){
        if(root==null) return;
        else{
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Main7_5 tree=new Main7_5();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);  //100번지가 들어왔다고 가정함

    }
}
