package com.nagappans.dsalgolab.trees;

import org.junit.Test;

public class BinaryTreeIterativeTraversalTest {

    @Test
    public void testPreorderIterative() {
        //int arr[] = {2, 1, 3};
        int arr[] = {30, 20, 40, 10, 25, 38, 42, 8, 12, 23};
        BinaryTreeIterativeTraversal binaryTreeIterativeTraversal = new BinaryTreeIterativeTraversal(arr);
        System.out.println(binaryTreeIterativeTraversal.preorderIterative());
        System.out.println(binaryTreeIterativeTraversal.inorderIterative());
        System.out.println(binaryTreeIterativeTraversal.postOrderIterative());
    }
}
