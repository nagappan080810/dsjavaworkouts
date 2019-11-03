package com.nagappans.dsalgolab.arrays;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class ArraySumEqualXTest {
    @Test
    public void checkPairInArray() {
        int input[] = {10, 8, 2, 4, 3, 7, 1};

        int sum = 19;
        int expected[] = new int[2];
        ArraySumEqualX arraySumEqualX = new ArraySumEqualX();
        int result[] = arraySumEqualX.findPair(input, sum);
        System.out.println(Arrays.toString(result));
        assertTrue(Arrays.equals(result, expected));


        sum = 10;
        expected[0] = 8; expected[1] = 2;
        result = arraySumEqualX.findPair(input, sum);
        System.out.println(Arrays.toString(result));
        assertTrue(Arrays.equals(result, expected));
    }
}
