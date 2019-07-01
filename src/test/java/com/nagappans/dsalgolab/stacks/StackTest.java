package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StackTest {

    @Test(expected = RuntimeException.class)
    public void testPushForOverflow() {
        Stack<Integer> stack = new Stack<>();
        for (int num=1; num<=11; num++) {
            stack.push(num);
        }
        ArrayList<Integer> test;
    }

    @Test
    public void testPopForEmpty() {
        Stack<Integer> stack = new Stack<>();
        try {
            stack.pop();
            fail("It should have failed for empty stacks");
        } catch(Exception exception) {
            assertEquals("Stack is Empty", exception.getMessage());
        }
    }

}
