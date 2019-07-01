package com.nagappans.dsalgolab.arrays;

import com.nagappans.dsalgolab.arrays.BinarySearchSortedRotatedArray;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchSortedRotatedArrayTest {
    @Test
    public void findElemInBinarySearch() {
        int arr[] = {68, 70, 72, 4, 11, 12, 17, 19, 24};
        BinarySearchSortedRotatedArray binarySearchSortedRotatedArray = new BinarySearchSortedRotatedArray();
        assertTrue(binarySearchSortedRotatedArray.findElemByBinarySearch(arr, 12));
        assertTrue(binarySearchSortedRotatedArray.findElemByBinarySearch(arr, 70));
    }
}
