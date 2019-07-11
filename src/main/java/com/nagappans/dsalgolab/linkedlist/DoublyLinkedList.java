package com.nagappans.dsalgolab.linkedlist;

public class DoublyLinkedList<K,V> {

    private final static int SIZE = 3;

    private Node<K,V> head = null;
    private Node<K,V> tail = null;

    public Node<K,V> insertNode(K key, V elem) {
        Node<K,V> node = new Node<>(key, elem);
        if (isEmpty()) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        return node;
    }

    public void moveNodeToHead(Node<K,V> node) {
        if (head==node) {
            return;
        }
        Node<K,V> prevNode = node.prev;
        Node<K,V> nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        node.next = head;
        node.prev = null;

        head = node;
    }

    public Node<K,V> removeNode() {
        if (isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node<K,V> removedNode = tail;
        tail = tail.prev;
        tail.next = null;
        return removedNode;
    }

    public boolean isEmpty() {
        return head==null;
    }

    public int size() {
        Node<K,V> current = head;
        int count = 0;
        while (current!=null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean isFull() {
        return size() == SIZE;
    }

    public static class Node<K, V> {
        private Node prev;
        private Node next;
        private V elem;
        private K key;

        public Node(K key, V elem) {
            this.key = key;
            this.elem = elem;
        }

        public Node(K key, V elem, Node prev, Node next) {
            this.key = key;
            this.prev = prev;
            this.next = next;
            this.elem = elem;
        }

        public V getValue() {
            return this.elem;
        }
        public K getKey() {
            return this.key;
        }
    }
}
