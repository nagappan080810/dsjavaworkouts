package com.nagappans.dsalgolab.strings;

import org.junit.Test;

public class StringPermutationTest {

    @Test
    public void testPermutations() {
        String a = "abc";
        StringPermutation stringPermutation = new StringPermutation();
        System.out.println(stringPermutation.findPermutationString(a));
    }
}
