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

    public String find(int key) {
        // Start at the root node
        Node node = find(root,key);

        // Ternary operator. Return null is node = null is true, if false return node.val
        return node == null ? null : node.val;
    }

    public Node find(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        } else if (node.key < key) {
            return find(node.left, key);
        } else if (node.key > key) {
            return find(node.right, key);
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
        } else if (node.key < key) {
            return  insert(node.left, key,val);
        } else if (node.key > key) {
            return insert(node.right, key, val);
        }
        return node;
    }

}
