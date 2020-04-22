package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void push() {

        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3, stack.pop());
    }
}
