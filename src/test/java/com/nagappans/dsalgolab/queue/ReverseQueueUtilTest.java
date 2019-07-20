package com.nagappans.dsalgolab.queue;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class ReverseQueueUtilTest {
    @Test
    public void testQueueIsReversed() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(10); arrayDeque.push(20); arrayDeque.push(30);
        ReverseQueueUtil.reverseUsingStack(arrayDeque);
        assertEquals(arrayDeque.toString(), "[30, 20, 10]");
        System.out.println(arrayDeque);
    }

    @Test
    public void testQueueReversedByRecursion() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(10); arrayDeque.push(20); arrayDeque.push(30);
        ReverseQueueUtil.reverseUsingRecursion(arrayDeque);
        assertEquals(arrayDeque.toString(), "[30, 20, 10]");
        System.out.println(arrayDeque);
    }
}
