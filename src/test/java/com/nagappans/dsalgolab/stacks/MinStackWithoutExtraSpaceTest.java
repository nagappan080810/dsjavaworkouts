package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackWithoutExtraSpaceTest {
    @Test
    public void checkMinStackWorksAndReturnsMinElement() {
        MinStackWithoutExtraSpace minStackWithoutExtraSpace = new MinStackWithoutExtraSpace();
        minStackWithoutExtraSpace.push(5);
        minStackWithoutExtraSpace.push(3);
        minStackWithoutExtraSpace.push(7);
        minStackWithoutExtraSpace.push(2);
        minStackWithoutExtraSpace.push(9);
        minStackWithoutExtraSpace.push(6);
        System.out.printf("popped element %d\n", minStackWithoutExtraSpace.pop());
        assertEquals(new Integer(2), minStackWithoutExtraSpace.minElement());
        System.out.printf("popped element %d\n", minStackWithoutExtraSpace.pop());
        System.out.printf("popped element %d\n", minStackWithoutExtraSpace.pop());
        assertEquals(new Integer(3), minStackWithoutExtraSpace.minElement());
        System.out.printf("popped element %d\n", minStackWithoutExtraSpace.pop());
        System.out.printf("popped element %d\n", minStackWithoutExtraSpace.pop());
        assertEquals(new Integer(5), minStackWithoutExtraSpace.minElement());

    }
}
