package com.nagappans.dsalgolab.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReverseLinkedListTest {
    @Test
    public void testIsReverse() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);list.add(3);list.add(2);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseByRecursion(list);
        list.print();
    }

    @Test
    public void testIsPalindrome() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);list.add(3);list.add(5);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        assertFalse(reverseLinkedList.isPalindrome(list.getHead()));

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);list1.add(3);list1.add(2);
        assertTrue(reverseLinkedList.isPalindrome(list1.getHead()));

    }
}
