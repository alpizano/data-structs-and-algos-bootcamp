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

    // O(1)
    public String get(int index) {
        return (String) array[index];
    }

    // O(1)
    public void set(int index, String val) {
        array[index] = val;
    }

    public void add(String val) {
        array[size] = val;
        size++;
    }

    // O(n+1) -> O(n)
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

    // O(n)
    public void delete(int index) {
        // clear last element of array by setting equal to null
        if(size-1 == index) {
            array[index] = null;
        }
        else {
            // Copy elements down
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
        }

        size--;
    }

    // O(n)
    public boolean contains(String val)  {
        boolean containsVal = false;

        for(int i=0; i<array.length; i++) {
            if(array[i] == val) {
                containsVal = true;
            }
        }

        return containsVal;
    }

    // O(1)
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}


