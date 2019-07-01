package com.nagappans.dsalgolab.stacks;

public class Stack<T> implements IStack<T> {

    private Object arr[] = new Object[10];
    private int index=0;

    public void push(T elem) {
        if (isFull()) {
            throw new RuntimeException("Stack overflow exception");
        }
        arr[index++] = elem;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return (T) arr[--index];
    }

    public boolean isEmpty() {
        if (index==0) {
            return true;
        }
        return false;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return (T) arr[index-1];
    }

    private boolean isFull() {
        return index==arr.length;
    }

}
