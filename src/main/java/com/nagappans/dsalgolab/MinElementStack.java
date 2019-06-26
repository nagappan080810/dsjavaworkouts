package com.nagappans.dsalgolab;

public class MinElementStack implements IStack<Integer>{
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    @Override
    public void push(Integer num) {
        mainStack.push(num);
        if (minStack.isEmpty() || num < minStack.peek()) {
            minStack.push(num);
        }
    }

    @Override
    public Integer pop() {
        Integer num = mainStack.pop();
        if (num==minStack.peek()) {
            minStack.pop();
        }
        return num;
    }

    @Override
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    @Override
    public Integer peek() {
        return mainStack.peek();
    }

    public Integer minElement() {
        return minStack.peek();
    }
}