package com.nagappans.dsalgolab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedundantBracesTest {

    @Test
    public void testRedundantBraces() {
        RedundantBraces redundantBraces = new RedundantBraces();
        assertEquals(1, redundantBraces.braces("((a+b))"));
        assertEquals(0, redundantBraces.braces("(a+(a+b))"));
        assertEquals(1, redundantBraces.braces("A : \"(a)\""));
    }
}
