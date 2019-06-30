package com.nagappans.dsalgolab;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NextGreatestUtilTest {

    @Test
    public void testNextGreatestElement() {
        int arr[] = {7, 22, 4, 12, 25, 3, 9};
        NextGreatestUtil nextGreatestUtil = new NextGreatestUtil();
        System.out.println(Arrays.toString(nextGreatestUtil.findNextGreatestElementsArray(arr)));
        assertEquals("[22, 25, 12, 25, -1, 9, -1]", Arrays.toString(nextGreatestUtil.findNextGreatestElementsArray(arr)));
    }
}
