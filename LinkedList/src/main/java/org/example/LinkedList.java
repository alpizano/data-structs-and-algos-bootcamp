package org.example;

public class LinkedList {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    /**
     * No constructor, so Java will create default no args constructor
     */

    // Track head
    private Node head;
    private int size;

    public void addFront(int val) {
        Node newNode = new Node(val);

        // If head... set and return
        if (head == null ) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head  = newNode;
        size++;
    }

    public int getFirst() {
        return head.val;
    }

    public int getLast() {
        Node cursor = head;

        while(cursor.next != null) {
            cursor=cursor.next;
        }
        return cursor.val;
    }

    public void addBack(int val) {
         // Create new Node
        Node newNode = new Node(val);

        // If head... set and return
        if (head == null ) {
            head = newNode;
            size++;
            return;
        }

        // Start at the head
        Node cursor = head;

        // Walk back node = null
        while(cursor.next != null) {
            cursor=cursor.next;
        }

        cursor.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
