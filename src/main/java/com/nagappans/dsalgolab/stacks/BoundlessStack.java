package com.nagappans.dsalgolab.stacks;

import java.util.Arrays;

public class BoundlessStack<T> implements IStack<T> {

    private static int SIZE_LIMIT = 10;
    private Object[] arr = null;
    private int index=0;
    private int currentLimit = SIZE_LIMIT;

    public BoundlessStack() {
        arr = new Object[SIZE_LIMIT];
    }


    @Override
    public void push(T elem) {
        checkAndResize();
        arr[index++] = elem;
    }

    public void checkAndResize() {
        if (index>=currentLimit) {
            currentLimit += (SIZE_LIMIT/2);
            System.out.println("resized to "+ currentLimit);
            this.arr = Arrays.copyOf(this.arr, currentLimit);
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) arr[--index];
    }

    @Override
    public boolean isEmpty() {
        if (index==0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T peek() {
        return (T) arr[index-1];
    }
}
