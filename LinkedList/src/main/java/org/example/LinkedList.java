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
        Node node = new Node(val);
        node.next = head;
        head  = node;
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
}
