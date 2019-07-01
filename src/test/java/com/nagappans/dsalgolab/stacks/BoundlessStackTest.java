package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BoundlessStackTest {
    @Test
    public void testStackNotOverflow() {
        BoundlessStack<Integer> stack = new BoundlessStack<>();
        for (int i=0; i<15; i++) {
            stack.push(i);
        }
        for (int i=14; i<=0; i--) {
            assertTrue(i==stack.pop());
        }
    }
}
