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
        // Generate the hashed index
        int hashIndex = generateHashIndex(key);

        // Create new HashEntry
        HashEntry entry = new HashEntry(key,val);

        // Array index is empty case - add entry
        if(data[hashIndex] == null) {
            data[hashIndex] = entry;
        }
        // Collision case
        else {
            // Get the Linked List in index
            System.out.println("COLLISION DETECTED");
            HashEntry list = data[hashIndex];

            // Add to end of list O(n)
            // Why not add to head of list O(1)?
            System.out.println("Linked List contains: ");
            while (list.next != null) {
                System.out.println("inloop: key -> " + list.key + " val -> " + list.val);
                list = list.next;
            }
            System.out.println("outloop: key -> " + list.key + " val -> " + list.val);
            // Add HashEntry to end of LinkedList
            list.next = entry;
            System.out.println("added to end: key -> " + list.next.key + " val -> " + list.next.val);
            System.out.println();
        }

    }

    // Get returns Value for Key parameter
    public String get(String key) {
        String answer = "";

        // get Hashed index
        int hashIndex = generateHashIndex(key);

        // if value for index is null
        if(data[hashIndex] == null) {
            return null;
        }

        HashEntry entry = data[hashIndex];

        while(entry != null) {
            if(entry.key.equals(key)) {
               answer = entry.val;
            }
            entry=  entry.next;
        }
        return answer;
    }

    // Hashing algorithm logic inside getIndex
    private int generateHashIndex(String key) {
        int hashCode = key.hashCode();


        // Convert to index. Bit wise AND to force positive index
        int index = (hashCode & 0x7fffffff) % CAPACITY;

        System.out.println("hashCode = "+hashCode + " for key: " + key + " is" + " index =" + index);
        System.out.println();

        // Force collision
        if (key.equals("John Smith") || key.equals("Sandra Doe")) {
            index = 4;
        }


        return index;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }


}
