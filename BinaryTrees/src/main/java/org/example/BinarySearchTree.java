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

    public BinarySearchTree() {
        root = null;
    }

    public String find(int target) {
        // Start at the root node
        Node node = find(root,target);

        // Ternary operator. Return null is node = null is true, if false return node.val
        return node == null ? null : node.val;
    }

    public Node find(Node node, int target) {
        if (node == null || node.key == target) {
            return node;
        } else if ( target < node.key) {
            return find(node.left, target);
        } else if (target > node.key) {
            return find(node.right, target);
        }

        // If key is not found in BST, return null
        return null;
    }

    public void insert(int key, String val) {
        root = insert(root, key, val);
    }

    public Node insert(Node node, int key,String val) {
        Node newNode = new Node(key, val);

        if (node == null) {
            node = newNode;
            return node;
        }

        if (key < node.key) {
            node.left =  insert(node.left, key,val);
        } else {
            node.right = insert(node.right, key, val);
        }
        return node;
    }

}
