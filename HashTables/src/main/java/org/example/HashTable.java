package org.example;

import java.util.Arrays;

public class HashTable {
    // Linked List for Collisions
     class HashEntry {
        String key;
        String val;
        HashEntry next;

        public HashEntry(String key, String val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    private int CAPACITY = 10;
    HashEntry[] data;

    public HashTable() {
        data = new HashEntry[CAPACITY];
    }

    public void put(String key, String val) {
        // Get hashed index first
        int hashIndex = getHashIndex(key);

        // Create new HashEntry
        HashEntry entry = new HashEntry(key,val);

        // Array index is null case
        if(data[hashIndex] == null) {
            data[hashIndex] = entry;
        }
        else {
            // Collision case
            // Get the Linked List in index
            System.out.println("collision");
            HashEntry list = data[hashIndex];

            while (list.next != null) {
                list = list.next;
            }
            System.out.println("key -> " + list.key + " val -> " + list.val);

            // Add HashEntry to end of LinkedList
            list.next = entry;
            System.out.println("key -> " + list.next.key + " val -> " + list.next.val);

        }

    }

    // Get returns Value for Key parameter
    public String get(String key) {
        String answer = "";

        // get Hashed index
        int hashIndex = getHashIndex(key);

        // if value for index is null
        if(data[hashIndex] == null) {
            return null;
        }

        HashEntry entry = data[hashIndex];

        while(entry.next != null) {
            if(entry.key.equals(key)) {
               answer = entry.val;
            }
            entry 2
                =  entry.next;
        }
        return answer;
    }

    // Hashing algorithm logic inside getIndex
    private int getHashIndex(String key) {
        int hashCode = key.hashCode();
        System.out.println("hashCode= "+hashCode + " for key: " + key + " is");

        // Convert to index. Bit wise AND to force positive index
        int index = (hashCode & 0x7fffffff) % CAPACITY;

        System.out.println("index = " + index);
        System.out.println();
        return index;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }


}
