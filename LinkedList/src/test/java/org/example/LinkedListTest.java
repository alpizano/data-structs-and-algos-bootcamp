package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void addFront() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(3, linkedList.getFirst());
        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void addBack() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        linkedList.addBack(42);

        Assert.assertEquals(3, linkedList.getFirst());
        Assert.assertEquals(42, linkedList.getLast());
    }

    @Test
    public void getFirst() {
        linkedList.addFront(1);
        Assert.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void getLast() {
        linkedList.addFront(33);
        linkedList.addFront(42);
        Assert.assertEquals(33, linkedList.getLast());
    }

    @Test
    public void size() {
        Assert.assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        Assert.assertEquals(1, linkedList.size());
        linkedList.addBack(2);
        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void clear(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();
        Assert.assertEquals(0,linkedList.size());

    }
}
