package com.nagappans.dsalgolab.bitwiseoperations;

/*
 * Given an array of integers, every element appears twice expect one element.
 *
 * Hint : XOR 2 ^ 2 = 0, 2 ^ 3 = 1
 */

public class FindUniqueElementInArray {

    public int findUniqueElement(int arr[]) {
        int uniqueElement = 0;
        for (int i=0; i<arr.length; i++) {
            uniqueElement = uniqueElement ^ arr[i];
        }
        return uniqueElement;
    }
}

