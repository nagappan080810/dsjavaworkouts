package com.nagappans.dsalgolab.linkedlist;

import org.junit.Test;
import java.util.LinkedList;

public class PrintNoOfOccurencesTest {

    @Test
    public void testOccurrencesIsPrinted() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);list.add(2);list.add(5);list.add(5);
        list.add(2);list.add(6);list.add(7);list.add(6);
        PrintNoOfOccurences.printOccurences(list);
    }
}
