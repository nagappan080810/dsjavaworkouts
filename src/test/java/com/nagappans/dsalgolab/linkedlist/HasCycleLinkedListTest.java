package com.nagappans.dsalgolab.linkedlist;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasCycleLinkedListTest {
    @Test
    public void hasCycle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        LinkedList.ListNode<Integer> node = list.add(3);
        list.add(2); list.add(node);
        assertTrue(HasCycleLinkedList.hasCycle(list));
    }

    @Test
    public void hasCycleByFloydsApproach() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        LinkedList.ListNode<Integer> node = list.add(3);
        list.add(2); list.add(node);
        assertTrue(HasCycleLinkedList.hasCycleByFloydsAlgorithm(list));
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(5); list1.add(3); list1.add(2);
        list1.add(6);
        assertFalse(HasCycleLinkedList.hasCycleByFloydsAlgorithm(list1));
    }
}
