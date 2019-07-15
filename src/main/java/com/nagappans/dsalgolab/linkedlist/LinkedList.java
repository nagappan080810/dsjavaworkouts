package com.nagappans.dsalgolab.linkedlist;

import java.util.Iterator;

public class LinkedList<T>  implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return new Iterator() {
            ListNode<T> current = head;
            public T next() {
                T elem = current.elem;
                current = current.next;
                return elem;
            }

            public boolean hasNext() {
                return current != null ? true: false;
            }
        };
    }

    static class ListNode<T> {
        T elem;
        ListNode<T> next;
        public ListNode(T elem, ListNode<T> next) {
            this.elem = elem;
            this.next = next;
        }
        public ListNode(T elem) {
            this(elem, null);
        }

        public T getElem() {
            return this.elem;
        }
    }

    LinkedList() {
        this.head  = null;
        this.tail  = null;
    }

    private ListNode<T> head, tail;

    public ListNode<T> add(T elem) {
        ListNode<T> newNode = new ListNode<>(elem);
        add(newNode);
        return newNode;
    }

    public void add(ListNode<T> node) {
        if (tail!=null) {
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
    }

    public void print() {
        ListNode<T> current = head;
        while (current !=null) {
            System.out.println("value "+current.elem);
            current = current.next;
        }
    }

    public T poll() {
        T elem = head.elem;
        if (head.next !=null) {
            head = head.next;
        }
        return elem;
    }
}
