package org.example;

public class DynamicArray<String> {
    Object[] array;
    int size;
    int capacity;

    public DynamicArray() {
        array = new Object[0];
        size = 0;
        capacity = 0;
    }

    public DynamicArray(int capacity) {
        array = new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public String get(int index) {
        return (String) array[index];
    }

    public void set(int index, String val) {
        array[index] = val;
    }

    public void add(String val) {
        array[size] = val;
        size++;
    }

    public void insert(int index, String val) {
        // If size == capacity, create a new array and copy old elements into it
        if (size == capacity) {
            resize();
        }

        // Copy elements up
        for (int i = size; i > index; i--) {
            array[i] = array[i- 1];
        }

        // Insert element
        array[index] = val;
        size++;
    }

    public void resize() {
        Object[] new_array = new Object[capacity * 2];

        // Copy elements into new array
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }

        // Save new capacity
        capacity = capacity * 2;

        // Set array to point to new array
        array = new_array;
    }
}


