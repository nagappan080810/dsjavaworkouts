package com.nagappans.dsalgolab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinElementStackTest {
    @Test
    public void checkMinElementReturned() {
        MinElementStack minElementStack = new MinElementStack();
        minElementStack.push(5);
        minElementStack.push(3);
        minElementStack.push(7);
        minElementStack.push(2);
        minElementStack.push(9);
        minElementStack.push(6);
        System.out.printf("popped element %d\n", minElementStack.pop());
        assertEquals(new Integer(2), minElementStack.minElement());
        System.out.printf("popped element %d\n", minElementStack.pop());
        System.out.printf("popped element %d\n", minElementStack.pop());
        assertEquals(new Integer(3), minElementStack.minElement());
        System.out.printf("popped element %d\n", minElementStack.pop());
        System.out.printf("popped element %d\n", minElementStack.pop());
        assertEquals(new Integer(5), minElementStack.minElement());
    }
}
