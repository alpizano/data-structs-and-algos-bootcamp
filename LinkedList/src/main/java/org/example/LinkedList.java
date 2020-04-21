package org.example;

public class LinkedList {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    // Track head
    private Node head;

    public void addFront(int val) {
        Node node = new Node(val);
        node.next = head;
        head  = node;
    }
}
