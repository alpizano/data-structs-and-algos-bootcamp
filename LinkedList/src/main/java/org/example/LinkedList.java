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

    public void addFront(int val) {
        Node newNode = new Node(val);

        // If head... set and return
        if (head == null ) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head  = newNode;
    }

    public int getFirst() {
        return head.val;
    }

    public int getLast() {
        Node cursor = head.next;

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
            return;
        }

        // Start at the head
        Node cursor = head.next;

        // Walk back node = null
        while(cursor.next != null) {
            cursor=cursor.next;
        }

        cursor.next = newNode;
    }
}
