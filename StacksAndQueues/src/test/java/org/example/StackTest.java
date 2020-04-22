package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest {
    Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3, stack.pop());
    }

    @Test
    public void push() {
        stack.push(1);

        Assert.assertEquals(1, stack.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void popEmptyStack() {
        stack.pop();
    }
}
