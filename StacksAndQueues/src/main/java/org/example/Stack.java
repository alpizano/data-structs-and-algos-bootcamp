package org.example;

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
       newNode = head;

       head = newNode;
    }

    public boolean isEmpty() {
        return head == null;
    }


    // O(1)
    public int pop() {
        if(stack)
        head = head.next;
    }

}
