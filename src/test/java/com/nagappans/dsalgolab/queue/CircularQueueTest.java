package com.nagappans.dsalgolab.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircularQueueTest {
    @Test
    public void testEnqueueDequeue() {
        CircularQueue<Integer> testCircularQueue = new CircularQueue<>();
        assertTrue(testCircularQueue.isEmpty());
        testCircularQueue.enqueue(5);
        testCircularQueue.enqueue(7);
        testCircularQueue.enqueue(9);
        assertTrue(testCircularQueue.isFull());
        assertTrue(testCircularQueue.dequeue()==5);
        testCircularQueue.enqueue(12);

    }
}
