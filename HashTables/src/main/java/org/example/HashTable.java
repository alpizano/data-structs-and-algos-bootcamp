package org.example;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
        // Get hashed index first
        int index = getIndex(key);

        // Array index is null case
        if(data[index] == null) {
            data[index] = new HashEntry(key,val);
        }

        // Collision case
        // Get the Linked List in index
        HashEntry entry = data[index];

        while(entry.next != null) {
            entry = entry.next;
        }

        // Add HashEntry to end of LinkedList
        entry.next = new HashEntry(key,val);

    }

    // Get returns Value for Key parameter
    public String get(String key) {

    }

    // Hashing algorithm logic inside getIndex
    private int getIndex(String key) {
        int hashCode = key.hashCode();
        System.out.println("hashCode=");

        // Convert to index. Bit wise AND to force positive index
        int index = hashCode & 0x7fffffff % CAPACITY;

        System.out.println("index = " + index);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }


}
