package com.nagappans.dsalgolab.arrays;

public class ZigZagArrangement {

    public void arrangeZigZag(int[] arr) {
        if (arr == null) return;

        for (int i=0; i<arr.length-1; i++) {
            if ( i%2==0 ) {
                if (arr[i] > arr[i+1]) swap(arr, i, i+1);
            } else {
                if (arr[i] < arr[i+1]) swap(arr, i, i+1);
            }
        }
    }

    private void swap(int arr[], int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
