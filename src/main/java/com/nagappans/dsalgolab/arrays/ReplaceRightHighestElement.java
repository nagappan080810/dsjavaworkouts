package com.nagappans.dsalgolab.arrays;

public class ReplaceRightHighestElement {
    /**
     * Method to replace all elements with right most highest element
     *  i/p: 10, 8, 2, 4, 3, 7, 1
     *  o/p:  8, 7, 7, 7, 7, 1, -1
     * @param inputArr
     * @return
     */
    public int[] replaceRightHighestElement(int[] inputArr) {
        if (inputArr==null) return null;

        int highestElement = -1, i = inputArr.length-1, rightValue = -1;

        while (i>=0) {
            int temp = inputArr[i];
            if (rightValue > highestElement) {
                inputArr[i] = rightValue;
                highestElement = rightValue;
            } else {
                inputArr[i] = highestElement;
            }
            rightValue = temp;
            i--;
        }
        return inputArr;
    }
}
