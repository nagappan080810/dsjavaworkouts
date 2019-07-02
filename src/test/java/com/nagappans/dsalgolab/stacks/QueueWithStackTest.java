package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueueWithStackTest {
    @Test
    public void testQueueOperations() {
        IQueue<Integer> queue = new QueueWithStack<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(3);queue.enqueue(5);queue.enqueue(7);
        assertTrue(queue.peek()==3);
        assertTrue(queue.dequeue()==3);
    }
}
