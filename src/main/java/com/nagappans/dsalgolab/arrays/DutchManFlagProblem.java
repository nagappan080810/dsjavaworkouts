package com.nagappans.dsalgolab.arrays;

public class DutchManFlagProblem {

    public int[] align(int[] arr) {
        int l=0, m=0;
        int h=arr.length-1;

        while (m<=h && l<=m && m<arr.length) {
            switch (arr[m]) {
                case 0:
                    swap(arr, l, m);
                    l++; m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(arr, m, h);
                    h--;
                    break;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
