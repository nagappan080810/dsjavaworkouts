package com.nagappans.dsalgolab.stacks;
import java.util.Stack;

public class RecursiveReverseStack {
    /*
     *approach 1 - inputstack will be emptied and inserted each element at the bottom of stack.
     * space complexity and time complexity is O(n).
     */
    public static void reverseWithoutExtraSpace(Stack<Integer> inputStack) {
        if (inputStack.isEmpty()) {
            return;
        }
        Integer element = inputStack.pop();
        reverseWithoutExtraSpace(inputStack);
        pushToBotttom(inputStack, element);
    }


    public static void pushToBotttom(Stack<Integer> inputStack, Integer element) {
        if (inputStack.empty() ) {
            inputStack.push(element);
            return;
        }
        Integer popElement = inputStack.pop();
        pushToBotttom(inputStack, element);
        inputStack.push(popElement);
    }

    /*
     *approach 2 - another stack is created and which gets all the popped element into the target stack..
     * space complexity and time complexity is O(n).
     */
    public static Stack<Integer> reverseRecursively(Stack<Integer>  inputStack) {
        Stack<Integer> tempStack = new Stack<>();

        while(!inputStack.isEmpty()) {
            tempStack.push(inputStack.pop());
        }

        return tempStack;
    }

}
