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
        this.capacity = capacity;
        size = 0;
    }

    public String get(int index){
        return (String)array[index];
    }

    public void set(int index, String val) {
        array[index] = val;
    }

    public void add(String val) {
        array[size] = val;
        size++;
    }

    public void insert(int index, String val) {
        int p = size;

        // Check size
        if (size == capacity) {
            Object[] new_array = new Object[capacity*2];

            for (int i = size; i >= 0; i--) {
                if (i == index) {
                    new_array[index] = val;
                } else if (i > index) {
                    new_array[i] = array[i - 1];
                } else if (i < index) {
                    new_array[i] = array[i];
                }
            }
            array = new_array;
        }
        else {
            // Copy elements
            for (int i = size - index; i > 0; i--) {
                array[p] = array[p - 1];
                p--;
            }

            // Insert elements
            array[index] = val;
        }


        }
    }


