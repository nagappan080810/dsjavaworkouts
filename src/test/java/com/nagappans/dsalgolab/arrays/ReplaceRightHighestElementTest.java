package com.nagappans.dsalgolab.arrays;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ReplaceRightHighestElementTest {
    /**
     * Method to replace all elements with right most highest element
     *  i/p: 10, 8, 2, 4, 3, 7, 1
     *  o/p:  8, 7, 7, 7, 7, 1, -1
     */
    @Test
    public void testReplaceRightHighestElement() {

        ReplaceRightHighestElement replaceRightHighestElement = new ReplaceRightHighestElement();

        int input[] = {10, 8, 2, 4, 3, 7, 1};
        int expected[] = {8, 7, 7, 7, 7, 1, -1};
        replaceRightHighestElement.replaceRightHighestElement(input);
        assertTrue(Arrays.equals(input, expected));

        int input1[] = {10, 8};
        int expected1[] = {8, -1};
        replaceRightHighestElement.replaceRightHighestElement(input1);
        assertTrue(Arrays.equals(input1, expected1));

        int input2[] = null;
        int expected2[] = null;
        replaceRightHighestElement.replaceRightHighestElement(input2);
        assertTrue(Arrays.equals(input2, expected2));

    }
}
