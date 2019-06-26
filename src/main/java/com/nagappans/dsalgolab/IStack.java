package com.nagappans.dsalgolab;

public interface IStack<T extends Object> {

    void push(T elem);

    T pop();

    boolean isEmpty();

    T peek();
}
