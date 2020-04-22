package org.example;

public class Queue {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    // Need tail reference to be O(1) remove
    private Node head;
    private Node tail;

    public void add(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        



    }
}
