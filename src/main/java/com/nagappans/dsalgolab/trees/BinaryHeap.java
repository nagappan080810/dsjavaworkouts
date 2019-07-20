package com.nagappans.dsalgolab.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryHeap<T extends Comparable> {
    private static final int INTIAL_CAPACITY = 10;
    Object heap[] = new Object[INTIAL_CAPACITY];
    int currentIndex = 0;

    public BinaryHeap() {
    }

    public void add(Integer elem) {
        heap[currentIndex] = elem;
        heapify();
        currentIndex++;
    }

    public T min() {
        T element = (T) heap[0];
        heap[0] = heap[currentIndex-1];
        heap[currentIndex-1] = 0;
        currentIndex--;
        checkChildAndSwap(0);
        return element;
    }

    public void checkChildAndSwap(int index) {
        if (leftChild(index)>currentIndex || rightChild(index)>currentIndex) return;
        Comparable var1 = (Comparable<T>) heap[index];
        Comparable var2 = (Comparable<T>) heap[leftChild(index)];
        Comparable var3 = (Comparable<T>) heap[rightChild(index)];
        if (var1.compareTo(var2)>0) {
            swap(index, leftChild(index));
            checkChildAndSwap(leftChild(index));
        } else if (var1.compareTo(var3)>0) {
            swap(index, rightChild(index));
            checkChildAndSwap(rightChild(index));
        }
    }

    public void heapify() {
        checkParentAndSwap(currentIndex);
    }

    private void checkParentAndSwap(int index) {

        if (index<=0) return;
        Comparable var1 = (Comparable<T>) heap[parentIndex(index)];
        Comparable var2 = (Comparable<T>) heap[index];


        if (var1.compareTo(var2) > 0) {
            swap(parentIndex(index), index);
        }
        checkParentAndSwap(parentIndex(index));
    }

    private void swap(int srcIndex, int targetIndex) {
        Object element = heap[srcIndex];
        heap[srcIndex] = heap[targetIndex];
        heap[targetIndex] = element;
    }

    public void print() {
        print(0);
    }

    public void print(int index) {
        Queue<Integer> indexToProcess = new ArrayDeque<>();
        indexToProcess.add(index);
        System.out.print(heap[index] + " ");
        while (!indexToProcess.isEmpty()) {
            Integer currentIndex = indexToProcess.poll();
            Integer leftIndex = leftChild(currentIndex);
            if (leftIndex !=-1) {
                indexToProcess.add(leftIndex);
                System.out.printf(" %d ", heap[leftIndex]);
            }

            Integer rightIndex = rightChild(currentIndex);
            if (rightIndex !=-1) {
                indexToProcess.add(rightIndex);
                System.out.printf(" %d ", heap[rightIndex]);
            }

        }
    }

    private int parentIndex(int index) {
        return (index-1)/2;
    }

    private int leftChild(int index) {
        return (2*index)+1 < heap.length ? (2*index)+1 : -1;
    }

    private int rightChild(int index) {
        return (2*index)+2 < heap.length ? (2*index)+2 : -1;
    }
}
