package com.java.project.arrays;

import java.util.Arrays;

public class CheckAnArrayIsSorted {

    public static void main(String[] args) {
        int[] sampleArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sampleArray2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] unSortedArray = {5, 10, 7, 9, 8, 1, 3, 4, 6, 2};

        System.out.printf("Is given array %s is sorted in ascending order : %s%n", Arrays.toString(sampleArray1),isArraySortedInAscendingOrder(sampleArray1));
        System.out.printf("Is given array %s is sorted in descending order : %s%n", Arrays.toString(sampleArray2),isArraySortedInDescendingOrder(sampleArray2));
        System.out.printf("Is given array %s is sorted in ascending order : %s%n", Arrays.toString(unSortedArray),isArraySortedInAscendingOrder(unSortedArray));
        System.out.printf("Is given array %s is sorted in descending order : %s%n", Arrays.toString(unSortedArray),isArraySortedInDescendingOrder(unSortedArray));
    }

    public static boolean isArraySortedInAscendingOrder(int[] inputArray) {
        boolean isArraySorted = false;
        int startIndex=0;
        int endIndex=inputArray.length-1;
        while(startIndex<endIndex){
            if((startIndex+1)<endIndex){
                if ((inputArray[startIndex] < inputArray[startIndex+1])) {
                    isArraySorted = true;
                } else {
                    isArraySorted = false;
                    break;
                }
            }
            startIndex++;
        }
        return isArraySorted;
    }

    public static boolean isArraySortedInDescendingOrder(int[] inputArray) {
        boolean isArraySorted = false;
        int startIndex=0;
        int endIndex=inputArray.length-1;
        while(startIndex<endIndex){
            if((startIndex+1)<endIndex){
                if ((inputArray[startIndex] > inputArray[startIndex+1])) {
                    isArraySorted = true;
                } else {
                    isArraySorted = false;
                    break;
                }
            }
            startIndex++;
        }
        return isArraySorted;
    }
}
