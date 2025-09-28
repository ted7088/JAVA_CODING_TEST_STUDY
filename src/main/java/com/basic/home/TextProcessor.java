package com.basic.home;

import java.io.*;
import java.util.*;

class Node {
    String content;
    int length;
    int uppercaseCount;
    int specialCount;
    Node prev, next;

    public Node(String content, int length, int uppercaseCount, int specialCount) {
        this.content = content;
        this.length = length;
        this.uppercaseCount = uppercaseCount;
        this.specialCount = specialCount;
        this.prev = this.next = null;
    }
}

class DoubleLinkedList {
    Node head, tail;

    public void insert(String content) {
        int length = content.length();
        int uppercaseCount = 0, specialCount = 0;

        for (char c : content.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (!Character.isLetterOrDigit(c) && c != ' ') {
                specialCount++;
            }
        }

        Node newNode = new Node(content, length, uppercaseCount, specialCount);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sort() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.content.compareTo(current.next.content) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    private void swap(Node a, Node b) {
        String tempContent = a.content;
        int tempLength = a.length;
        int tempUppercase = a.uppercaseCount;
        int tempSpecial = a.specialCount;

        a.content = b.content;
        a.length = b.length;
        a.uppercaseCount = b.uppercaseCount;
        a.specialCount = b.specialCount;

        b.content = tempContent;
        b.length = tempLength;
        b.uppercaseCount = tempUppercase;
        b.specialCount = tempSpecial;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d,%d,%d %s%n", current.length, current.uppercaseCount, current.specialCount, current.content);
            current = current.next;
        }
    }
}

public class TextProcessor {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.insert(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.sort();
        list.printList();
    }
}