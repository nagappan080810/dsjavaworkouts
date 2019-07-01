package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;


public class PrevSmallerUtilTest {

    @Test
    public void testPrevSmallerBruteForceApproach() {
        PrevSmallerUtil prevSmallerUtil = new PrevSmallerUtil();
        ArrayList<Integer> inputs = new ArrayList<>();
        inputs.addAll(Arrays.asList(4, 5, 2, 10, 8));
        //System.out.println(prevSmallerUtil.find(inputs)); //debug statement
        assertTrue(Arrays.asList(-1, 4, -1, 2, 2).equals(prevSmallerUtil.findByBruteForceApproach(inputs)));

        inputs.clear();
        inputs.addAll(Arrays.asList(3, 2, 1));
        //System.out.println(prevSmallerUtil.find(inputs)); //debug statement
        assertTrue(Arrays.asList(-1, -1, -1).equals(prevSmallerUtil.findByBruteForceApproach(inputs)));

    }


    @Test
    public void testPrevSmallerOptimalApproach() {
        PrevSmallerUtil prevSmallerUtil = new PrevSmallerUtil();
        ArrayList<Integer> inputs = new ArrayList<>();
        inputs.addAll(Arrays.asList(4, 5, 2, 10, 8));
        //System.out.println(prevSmallerUtil.find(inputs)); //debug statement
        assertTrue(Arrays.asList(-1, 4, -1, 2, 2).equals(prevSmallerUtil.findByOptimalApproach(inputs)));

        inputs.clear();
        inputs.addAll(Arrays.asList(3, 2, 1));
        //System.out.println(prevSmallerUtil.find(inputs)); //debug statement
        assertTrue(Arrays.asList(-1, -1, -1).equals(prevSmallerUtil.findByBruteForceApproach(inputs)));

    }
}
