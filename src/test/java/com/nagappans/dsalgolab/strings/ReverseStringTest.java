package com.nagappans.dsalgolab.strings;

import org.apache.commons.codec.binary.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    @Test
    public void testReverseString() {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("hello"));
        assertEquals("olleh", reverseString.reverse("hello"));
    }
}
