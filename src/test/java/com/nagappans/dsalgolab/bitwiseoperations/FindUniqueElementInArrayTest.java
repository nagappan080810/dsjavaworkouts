package com.nagappans.dsalgolab.bitwiseoperations;

import com.nagappans.dsalgolab.bitwiseoperations.FindUniqueElementInArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindUniqueElementInArrayTest {

    @Test
    public void checkUniqueElementReturned() {
        int arr[] = {1, 2, 3, 2, 1};
        FindUniqueElementInArray obj = new FindUniqueElementInArray();
        assertEquals(3, obj.findUniqueElement(arr));
    }
}
