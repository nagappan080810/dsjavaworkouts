package com.nagappans.dsalgolab.stacks;

import java.util.Stack;
import org.junit.Test;

public class SortStackTest {

    @Test
    public void checkStackIsSorted() {
        Stack<Integer> input = new Stack<>();
        input.push(4); input.push(6); input.push(3);input.push(9); input.push(10);
        SortStack sortStack = new SortStack();
        System.out.println(sortStack.sortByRecursive(input));
    }

    @Test
    public void checkForNoExtraSpace() {
        Stack<Integer> input = new Stack<>();
        input.push(4); input.push(6); input.push(3);input.push(9); input.push(10);
        SortStack sortStack = new SortStack();
        sortStack.sortByRecursiveWithoutExtraSpace(input);
        System.out.println(input);
    }
}
