package com.nagappans.dsalgolab.stacks;

import java.util.Stack;

public class SortStack {

    public Stack<Integer> sortByRecursive(Stack<Integer> input) {
        Stack<Integer> result = new Stack<>();
        while(!input.isEmpty()) {
            pushForSort(input.pop(), result);
        }
        return result;
    }

    public void sortByRecursiveWithoutExtraSpace(Stack<Integer> input) {
        if (input.isEmpty()) {
            return;
        }
        Integer temp = input.pop();
        sortByRecursiveWithoutExtraSpace(input);
        pushForSort(temp, input);
    }

    public Stack<Integer> pushForSort(int val, Stack<Integer> result) {
        if (result.isEmpty() || val <= result.peek()) {
            result.push(val);
        } else {
            Integer temp = result.pop();
            pushForSort(val, result);
            result.push(temp);
        }
        return result;
    }

}
