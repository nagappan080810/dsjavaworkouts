package com.nagappans.dsalgolab.trees;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryHeapTest {

    @Test
    public void testBinaryHeap() {
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>();
        binaryHeap.add(5);
        binaryHeap.add(2);
        binaryHeap.add(10);
        binaryHeap.add(12);
        binaryHeap.print();

        assertTrue(binaryHeap.min()==2);
        binaryHeap.print();
    }
}
