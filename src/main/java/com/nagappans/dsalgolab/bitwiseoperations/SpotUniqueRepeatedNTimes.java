package com.nagappans.dsalgolab.bitwiseoperations;

/*
 * Identify unique number in a array where all the elements are repeated thrice expect one number..
 * https://www.interviewbit.com/problems/single-number-ii/
 */
public class SpotUniqueRepeatedNTimes {
    public int findUniqueNumber(int[] arr, int N) {
        int result = 0, ithbit = 0;
        for (int i=0; i<32; i++) {
            int sum = 0;
            for (int j=0; j<arr.length; j++) {
                sum = sum + ((arr[j] >> i) & 1);
            }
            ithbit = sum % N;
            result = result | (ithbit<<i);
        }
        return result;
    }
}