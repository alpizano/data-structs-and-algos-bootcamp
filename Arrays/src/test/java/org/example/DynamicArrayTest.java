package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

public class DynamicArrayTest {
    DynamicArray<String> array;

    @BeforeClass
    public void setUp() {
        array = new DynamicArray(10);
    }

    @Test
    public void getTest() {

    }

    @Test
    public void setTest() {

    }

    @Test
    public void insertTest() {

    }

    @Test
    public void addTest() {
        array.add("1");
        array.add("4");
        array.add("8");
    }
}
