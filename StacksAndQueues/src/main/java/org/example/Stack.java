package org.example;

public class Stack {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public void push(int val) {
       Node newNode = new Node(val);
       newNode = head;

       head = newNode;
    }
}
