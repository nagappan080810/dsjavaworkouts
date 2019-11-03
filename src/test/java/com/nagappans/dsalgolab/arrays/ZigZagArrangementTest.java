package com.nagappans.dsalgolab.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ZigZagArrangementTest {

    @Test
    public void testZigZagArrangement() {
        int input[] = {4, 3, 7, 8, 6, 2, 1};
        int expected[] = {3, 7, 4, 8, 2, 6, 1};
        ZigZagArrangement zigZagArrangement = new ZigZagArrangement();
        zigZagArrangement.arrangeZigZag(input);
        assertArrayEquals(input, expected);

        int input1[] = { 4 };
        int expected1[] = { 4 };
        zigZagArrangement.arrangeZigZag(input1);
        assertArrayEquals(input1, expected1);

        int input2[] = null;
        int expected2[] = null;
        zigZagArrangement.arrangeZigZag(input2);
        assertArrayEquals(input2, expected2);


    }
}
