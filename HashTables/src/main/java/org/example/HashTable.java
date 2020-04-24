package org.example;

public class HashTable {
    // Linked List for Collisions
    private static class Node {
        String key;
        String val;
        Node next;

        public Node(String key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    Node[] table = new Node[10];


}
