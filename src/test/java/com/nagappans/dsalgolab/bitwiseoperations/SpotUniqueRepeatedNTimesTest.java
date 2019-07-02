package com.nagappans.dsalgolab.bitwiseoperations;

import org.junit.Test;

public class SpotUniqueRepeatedNTimesTest {
    @Test
    public void testUniqueMethodWorks() {
        int arr[] = {3, 3, 4, 4, 5};
        SpotUniqueRepeatedNTimes spotUniqueRepeatedThrice = new SpotUniqueRepeatedNTimes();
        System.out.println(spotUniqueRepeatedThrice.findUniqueNumber(arr, 2));
    }
}
