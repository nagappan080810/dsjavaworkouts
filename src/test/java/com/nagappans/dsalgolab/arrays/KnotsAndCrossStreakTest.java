package com.nagappans.dsalgolab.arrays;

import org.junit.Test;

import java.io.*;

public class KnotsAndCrossStreakTest {

    @Test
    public void testFinderCount() throws FileNotFoundException {
        InputStream in = getClass().getClassLoader().getResourceAsStream("streaksproblem_input.txt");
        KnotsAndCrossStreak.finder(in);
    }
}
