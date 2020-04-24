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
            HashEntry entryList = data[hashIndex];

            while (entryList.next != null) {
                entryList = entryList.next;
            }

            // Add HashEntry to end of LinkedList
            entryList.next = entry;
        }

    }

    // Get returns Value for Key parameter
    public String get(String key) {
        String answer = "";

        // get Hashed index
        int index = getHashIndex(key);

        // if value for index is null
        if(data[index] == null) {
            return null;
        }

        HashEntry entry = data[index];

        while(entry.next != null) {
            if(entry.key == key) {
               answer = entry.val;
            }
            entry=entry.next;
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

        return index;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }


}
