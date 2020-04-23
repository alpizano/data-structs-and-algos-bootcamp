package org.example;

import java.util.EmptyStackException;

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
        // Create New Node
        Node newNode = new Node(val);

        // Special case when Queue is empty
        if(tail != null) {
            // Point Tail's reference to the newly created Node
            tail.next = newNode;
        }

        // Update tail reference; increment up by 1 so it points to last element in queue
        tail = newNode;

        // Special case when Queue is empty
        if(head == null) {
            head = tail;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int remove() {
        if(head == null) {
            throw new EmptyStackException();
        }

        int val = head.val;
        head = head.next;
        return val;
    }

    public void print() {
        for(Node cursor = head; cursor != null; cursor=cursor.next) {
            System.out.print(cursor.val + " ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(5);
        queue.add(10);

        queue.print();
    }

}
