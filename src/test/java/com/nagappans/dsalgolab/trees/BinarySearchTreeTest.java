package com.nagappans.dsalgolab.trees;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTreeTest {

    @Test
    public void testSearchElementFromGivenK(){
        int sortedArr[] = {2, 3, 8, 9, 10, 12, 12};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        assertTrue(binarySearchTree.binarySearch(sortedArr, 11)==10);
    }
}
