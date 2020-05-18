package org.example;

public class BinarySearchTree {
    static class Node {
        int key;
        String val;
        Node left, right;

        public Node(int key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    Node root;


    private Node find(Node node, int key) {
        if(node == null || node.key == key) {
            return node;
        }
        else if(node.key < key) {
            return find(node.left, key);
        }
        else if(node.key > key) {
            return find(node.right, key);
        }

        // If key is not found in BST, return null
        return null;
    }
}
