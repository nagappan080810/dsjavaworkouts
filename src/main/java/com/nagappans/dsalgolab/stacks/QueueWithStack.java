package com.nagappans.dsalgolab.stacks;

public class QueueWithStack<T> implements IQueue<T> {

    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();

    @Override
    public T dequeue() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    @Override
    public void enqueue(T elem) {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(elem);
    }

    @Override
    public T peek() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
