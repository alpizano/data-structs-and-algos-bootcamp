package org.example;

import java.util.EmptyStackException;

/**
 * Stack is FILO; First In Last Out
 */
public class Stack {
    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    // O(1)
    public void push(int val) {
       Node newNode = new Node(val);
       newNode.next = head;
       head = newNode;
    }

    // O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // O(1)
    public int pop() {
        if(head == null) {
            throw new EmptyStackException();
        }

        int val = head.val;
        head = head.next;
        return val;
    }

}
