package com.nagappans.dsalgolab.arrays;

public class ArraySumEqualX {
    /**
     * Array of integers and provide a value x.
     * input : 10 8 2 4 3 7 1    | x = 6
     * output: (2,4)
     */
    public int[] findPair(int[] input, int sum) {
        int pair[] = new int[2];
        for (int i=0; i<input.length; i++) {
            if (input[i] < sum) {
                pair[0] = input[i];
                int rem = sum - input[i];
                for (int j=i+1; j<input.length; j++) {
                    if (rem == input[j]) {
                        pair[1] = input[j];
                        return pair;
                    }
                }
                pair[0] = 0;
            }
        }
        return pair;
    }
}