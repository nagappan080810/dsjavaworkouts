package com.nagappans.dsalgolab.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckAnagramTest {
    @Test
    public void isAnagram() {
        CheckAnagram checkAnagram= new CheckAnagram();
        assertTrue(checkAnagram.isAnagramHashMapApproach("test", "stet"));
        assertFalse(checkAnagram.isAnagramHashMapApproach("the", "they"));
        assertTrue(checkAnagram.isAnagramHashMapApproach("peek", "keep"));
        assertTrue(checkAnagram.isAnagramHashMapApproach("mother in law", "hilter woman"));
        assertTrue(checkAnagram.isAnagramHashMapApproach("yak","kay"));
    }

    @Test
    public void testAnagram() {
        CheckAnagram checkAnagram = new CheckAnagram();
        assertTrue(checkAnagram.isAnagramBitwiseOperations("test", "stet"));
        assertFalse(checkAnagram.isAnagramBitwiseOperations("the", "they"));
        assertTrue(checkAnagram.isAnagramBitwiseOperations("peek", "keep"));
        assertTrue(checkAnagram.isAnagramBitwiseOperations("mother in law", "hilter woman"));
        assertTrue(checkAnagram.isAnagramBitwiseOperations("yak","kay"));

    }
}
