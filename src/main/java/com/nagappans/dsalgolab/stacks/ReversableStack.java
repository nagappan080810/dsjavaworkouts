package com.nagappans.dsalgolab.stacks;

public class ReversableStack<T> implements IStack<T> {
    private static class StackNode<T> {
        T elem;
        StackNode<T> next;
        StackNode(T elem) {
            this.elem = elem;
        }
    }

    private StackNode<T> top = null;

    @Override
    public void push(T elem) {
        StackNode<T> node = new StackNode<>(elem);
        node.next = top;
        top = node;
    }

    @Override
    public T pop() {
        StackNode<T> temp = top;
        top = top.next;
        return temp.elem;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public T peek() {
        return top.elem;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        StackNode<T> prev, curr, next;
        prev = curr = top;
        next = top.next;
        prev.next = null;
        //if more than one element only, it has to be reversed..
        while (next!=null) {
            curr = next;  //move to next curr node
            if (curr!=null) {
                next = curr.next;
            }
            curr.next = prev;
            //prev.next = null;
            prev=curr;
        }
        top = prev;
    }
}
