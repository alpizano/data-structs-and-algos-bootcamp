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
        if (size == capacity) {
           Object[] new_array = new Object[capacity*2];
           array = new_array;
        }

        // Copy elements
        for(int i=size; i>= size-index; i--) {
            array[i] = array[i-1];
        }

        // Insert elements
        array[index] = val;
    }
}
