package com.nagappans.dsalgolab.stacks;

public interface IStack<T extends Object> {

    void push(T elem);

    T pop();

    boolean isEmpty();

    T peek();
}
