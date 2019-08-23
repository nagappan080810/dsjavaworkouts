package com.nagappans.dsalgolab.linkedlist;

import org.junit.Test;

/**
 * Segregrate the odd position to the front and even position nodes to the end
 */
public class SegregateOldEvenNodesTest {

    @Test
     public void testOldEvenNodes() {
         SegregateOldEvenNodes segregateOldEvenNodes
                 = new SegregateOldEvenNodes();
         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
         segregateOldEvenNodes.createList(arr);
         segregateOldEvenNodes.printList();
         segregateOldEvenNodes.segregate();
         segregateOldEvenNodes.printList();
     }
}
