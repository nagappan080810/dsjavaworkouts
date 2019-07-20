package com.nagappans.dsalgolab.trees;

public class BinarySearchTree {
    /* find an element lesser than k but greatest with rest of elements in sorted arr*/
    public int binarySearch(int[] sortedArr, int k) {
        int start = 0;
        int end = sortedArr.length - 1;
        return doSearch(sortedArr, k, start, end);
    }

    private int doSearch(int[] sortedArr, int k, int start, int end) {
        if (end<=start) {
            if (sortedArr[start]>k) {
                return sortedArr[start-1];
            } else {
                return sortedArr[start];
            }

        }
        int mid = (end + start) / 2;
        if (sortedArr[mid] == k) {
            return sortedArr[mid];
        }
        if (sortedArr[mid]<k) {
            start = mid+1;
        } else {
            end = mid-1;
        }
        return doSearch(sortedArr, k, start, end);
    }
}
