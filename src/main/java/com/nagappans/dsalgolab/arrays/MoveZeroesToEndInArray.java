package com.nagappans.dsalgolab.arrays;

public class MoveZeroesToEndInArray {
    public int[] moveZeroes(int[] arr) {
        int j = arr.length -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0) {
                //find non zero in right end of array
                while(arr[j]==0){
                    j--;
                }
                if (j<i) break;
                //swap the left zero element to right part..
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j--] = temp;
            }
        }
        return arr;
    }

    public int[] moveZeroesOptimalSolution(int[] arr) {
        int zeroElemIndex=-1, numElemIndex=-1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0 && zeroElemIndex==-1) {
                zeroElemIndex = i;
            }
            if (zeroElemIndex!=-1 && arr[i]!=0) {
                numElemIndex = i;
                swap(arr, zeroElemIndex, numElemIndex);
                zeroElemIndex = i;
                numElemIndex = -1;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int sourceIndex, int targetIndex) {
        int temp = arr[sourceIndex];
        arr[sourceIndex] = arr[targetIndex];
        arr[targetIndex] = temp;
    }
}
