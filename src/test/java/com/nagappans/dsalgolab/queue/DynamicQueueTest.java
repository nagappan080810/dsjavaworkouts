package com.nagappans.dsalgolab.queue;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DynamicQueueTest {
    @Test
    public void testQueueSizeGrows() {

        DynamicQueue<Integer> dynamicQueue = new DynamicQueue<>();
        dynamicQueue.enqueue(3);
        dynamicQueue.enqueue(5);
        dynamicQueue.enqueue(12);
        dynamicQueue.enqueue(15);
        System.out.println(dynamicQueue.peek());
        assertTrue(dynamicQueue.peek()==3);
        assertTrue(dynamicQueue.dequeue()==3);
        assertTrue(dynamicQueue.dequeue()==5);
        assertTrue(dynamicQueue.dequeue()==12);
    }
}
