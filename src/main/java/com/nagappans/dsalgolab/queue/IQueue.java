package com.nagappans.dsalgolab.queue;

public interface IQueue<T> {
    public void enqueue(T elem);
    public T dequeue();
    public T peek();
    public boolean isEmpty();
    public boolean isFull();
}
