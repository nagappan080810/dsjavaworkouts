package com.nagappans.dsalgolab.stacks;

public interface IQueue<T> {

    T dequeue();

    void enqueue(T elem);

    T peek();

    boolean isEmpty();
}
