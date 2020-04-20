package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DynamicArrayTest {
    DynamicArray<String> array;

    @Before
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
        array.add("1");
        array.add("4");
        array.add("8");
        
        array.insert(1,"4");

        Assert.assertEquals("1", array.get(0));
        Assert.assertEquals("4", array.get(1));
        Assert.assertEquals("8", array.get(2));

    }

    @Test
    public void addTest() {
        array.add("1");
        array.add("4");
        array.add("8");

        Assert.assertEquals("1", array.get(0));
        Assert.assertEquals("4", array.get(1));
        Assert.assertEquals("8", array.get(2));
    }
}
