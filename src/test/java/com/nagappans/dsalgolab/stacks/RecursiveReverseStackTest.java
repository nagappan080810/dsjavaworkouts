package com.nagappans.dsalgolab.stacks;

import org.junit.Test;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class RecursiveReverseStackTest {
    @Test
    public void testReverseApproach1() {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(2); inputStack.push(4); inputStack.push(5); inputStack.push(3);
        RecursiveReverseStack.reverseWithoutExtraSpace(inputStack);
        assertEquals("[3, 5, 4, 2]", inputStack.toString());
    }

    @Test
    public void testReverseApproach2() {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(2); inputStack.push(4); inputStack.push(5); inputStack.push(3);
        Stack<Integer> resultStack = RecursiveReverseStack.reverseRecursively(inputStack);
        assertEquals("[3, 5, 4, 2]", resultStack.toString());
    }
}
