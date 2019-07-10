package com.nagappans.dsalgolab.queue;

public class CircularQueue<T> implements IQueue<T> {
    private static final int DEFAULT_CAPACITY = 3;

    private int current_capacity = DEFAULT_CAPACITY;

    private Object arr[] = new Object[DEFAULT_CAPACITY];

    private int front, rear=0;

    @Override
    public void enqueue(T elem) {
        if (isFull()) {
            throw new RuntimeException("CircularQueue is Full");
        }
        int index = computeIndex(rear);
        arr[index] = elem;
        rear++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("CircularQueue is empty");
        }
        T temp = (T) arr[computeIndex(front)];
        front++;
        return temp;
    }

    public int computeIndex(int actualIndex) {
        return actualIndex % current_capacity;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("CircularQueue is empty");
        }
        return (T) arr[computeIndex(front)];
    }

    @Override
    public boolean isEmpty() {
        if (front==rear) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if ((rear-front)==DEFAULT_CAPACITY) {
            return true;
        }
        return false;
    }
}
