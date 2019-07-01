package com.nagappans.dsalgolab.arrays;
/*
 * sorted and rotated array
 * eg: 68, 70, 72, 4, 11, 12, 17, 19, 24
 */
public class BinarySearchSortedRotatedArray {
    public boolean findElemByBinarySearch(int arr[], int elem) {
        int start=0, end=(arr.length-1), mid=0;
        while (start<=end) {
            mid = (start+end)/2;
            if (elem == arr[mid]){
                return true;
            }
            if (arr[start] < arr[end]) { //first part of array is sorted
                if (arr[start] <= elem && elem < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            else { //second part of array is sorted
                if (arr[mid] < elem && elem <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid + 1;
                }
            }

        }

        return false;
    }
}
