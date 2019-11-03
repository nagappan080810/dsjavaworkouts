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

    @Test
    public void testReverse1String() {
        ReverseString reverseString = new ReverseString();
        assertEquals("olleh",reverseString.reverse1("hello"));
        assertEquals("at",reverseString.reverse1("ta"));
        assertEquals("a",reverseString.reverse1("a"));
        assertEquals("",reverseString.reverse1(""));
        assertEquals(null,reverseString.reverse1(null));
    }
}
