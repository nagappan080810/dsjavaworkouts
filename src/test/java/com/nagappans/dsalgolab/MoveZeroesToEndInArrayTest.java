package com.nagappans.dsalgolab;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class MoveZeroesToEndInArrayTest {

    @Test
    public void checkZeroesMovedToEnd() {
        int arr[] = {1, 4, 0, 6, 8, 0, 3, 2, 0};
        MoveZeroesToEndInArray moveZeroesToEndInArray = new MoveZeroesToEndInArray();
        System.out.println(Arrays.toString(moveZeroesToEndInArray.moveZeroes(arr)));
        assertEquals("[1, 4, 2, 6, 8, 3, 0, 0, 0]", Arrays.toString(moveZeroesToEndInArray.moveZeroes(arr)));
    }

    @Test
    public void checkZeroesMovedToEndOptimal() {
        int arr[] = {1, 4, 0, 6, 8, 0, 3, 2, 0};
        MoveZeroesToEndInArray moveZeroesToEndInArray = new MoveZeroesToEndInArray();
        System.out.println(Arrays.toString(moveZeroesToEndInArray.moveZeroesOptimalSolution(arr)));
        assertEquals("[1, 4, 6, 8, 3, 2, 0, 0, 0]",
                Arrays.toString(moveZeroesToEndInArray.moveZeroesOptimalSolution(arr)));
    }

}
