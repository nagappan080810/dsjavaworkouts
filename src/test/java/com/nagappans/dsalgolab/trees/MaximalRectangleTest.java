package com.nagappans.dsalgolab.trees;

import org.junit.Test;

public class MaximalRectangleTest {

    @Test
    public void checkRectangleValues() {
        int arr[] = {10, 20, 50, 15, 30, 60, 70};
        MaximalRectangle maximalRectangle = new MaximalRectangle(arr);
        maximalRectangle.inOrderTraversal();
        System.out.println(maximalRectangle.getMaximalRectangle());
    }
}
