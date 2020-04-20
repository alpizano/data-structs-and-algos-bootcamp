package org.example;

public class DynamicArray<String> {
    Object[] array;
    int size;
    int capacity;

    public DynamicArray() {
        array = new Object[0];
        size = 0;
        capacity =0;
    }
    public DynamicArray(int capacity) {
        array = new Object[capacity];
        size = 0;
    }

    public String get(int index){
        return (String)array[index];
    }

    public void insert(int index, String val) {
        // Check size

        // Copy elements

        // Insert elements
    }
}
