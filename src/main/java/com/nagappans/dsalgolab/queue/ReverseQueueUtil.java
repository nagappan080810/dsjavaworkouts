package com.nagappans.dsalgolab.queue;

import java.util.ArrayDeque;
import java.util.Stack;

public class ReverseQueueUtil {
    public static void reverseUsingStack(ArrayDeque<Integer> arrayDeque) {
        Stack<Integer> stack = new Stack<>();
        while(!arrayDeque.isEmpty()) {
            Integer element = arrayDeque.poll();
            stack.push(element);
        }
        arrayDeque.clear();
        while(!stack.isEmpty()) {
            Integer element = stack.pop();
            arrayDeque.push(element);
        }
    }

    public static void reverseUsingRecursion(ArrayDeque<Integer> arrayDeque) {
        if (arrayDeque.isEmpty()) return;
        Integer element = arrayDeque.poll();
        reverseUsingStack(arrayDeque);
        arrayDeque.push(element);
    }

}
