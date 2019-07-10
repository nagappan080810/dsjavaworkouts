package com.nagappans.dsalgolab.queue;

public class DynamicQueue<T> implements IQueue<T> {

    private static final int DEFAULT_CAPACITY = 3;

    private int current_capacity = DEFAULT_CAPACITY;

    private Object[] arr = new Object[current_capacity];

    private int front, rear=0;

    @Override
    public void enqueue(T elem) {
        if (isFull()) {
            copyToBiggerArr(arr);
        }
        int index = computeIndex(rear);
        arr[index] = elem;
        rear++;
    }

    private void copyToBiggerArr(Object[] arr) {
        //allocate new array
        int new_capacity = current_capacity + DEFAULT_CAPACITY;
        Object[] newarr = new Object[new_capacity];
        //copy elements
        int index = 0;
        while(!isEmpty()) {
            newarr[index++] = dequeue();
        }
        //relocate the indexes and sizes..
        current_capacity = new_capacity;
        front = 0;
        rear = index;
        this.arr = newarr;
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

    private int computeIndex(int actualIndex) {
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
        if ((rear-front)==current_capacity) {
            return true;
        }
        return false;
    }

}
