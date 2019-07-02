package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReversableStackTest {
    @Test
    public void testIsReversed() {
        ReversableStack<Integer> reversableStack = new ReversableStack<>();
        reversableStack.push(2);reversableStack.push(3);reversableStack.push(5);
        assertTrue(reversableStack.peek()==5);
        reversableStack.reverse();
        assertTrue(reversableStack.pop()==2);
        assertTrue(reversableStack.pop()==3);
    }
}
