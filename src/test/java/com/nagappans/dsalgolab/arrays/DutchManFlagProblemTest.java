package com.nagappans.dsalgolab.arrays;

import org.junit.Test;

import java.util.Arrays;

public class DutchManFlagProblemTest {

    @Test
    public void testDutchManIsDone() {

        int arr[] = {2, 1, 1, 0, 2, 1, 0, 2};
        DutchManFlagProblem dutchManFlagProblem = new DutchManFlagProblem();
        System.out.println(Arrays.toString(dutchManFlagProblem.align(arr)));

    }
}
