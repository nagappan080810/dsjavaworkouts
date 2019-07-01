package com.nagappans.dsalgolab.strings;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegularExpressionPalindromeTest {

    @Ignore
    @Test
    public void testPalindromeFunction() {

        String s = "malaalam";
        RegularExpressionPalindrome regularExpressionPalindrome = new RegularExpressionPalindrome();
        assertTrue(regularExpressionPalindrome.isPalindrome(s));
    }
}
