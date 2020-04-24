package org.example;

import java.util.Arrays;

public class HashTable {
    // Linked List for Collisions
    private static class HashEntry {
        String key;
        String val;
        HashEntry next;

        public HashEntry(String key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    private int CAPACITY = 10;
    HashEntry[] data;

    public HashTable() {
        data = new HashEntry[CAPACITY];
    }

    public void put(String key, String val) {
        // Get index

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }


}
