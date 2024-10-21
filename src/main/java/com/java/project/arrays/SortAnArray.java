package com.java.project.arrays;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
        int[] array = {100, 5, -5, -50};
        System.out.printf("Given Array : %s%n", Arrays.toString(array));
        sortArrayInAsc(array);
        System.out.printf("Sorted array in Ascending order : %s%n", Arrays.toString(array));
        sortArrayInDesc(array);
        System.out.printf("Sorted array in Descending order : %s%n", Arrays.toString(array));
    }

    public static void sortArrayInAsc(int[] inputArray) {
        boolean swapped = true;
        int j = 0;
        int currentElementHolder = 0;

        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < inputArray.length - j; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    currentElementHolder = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = currentElementHolder;
                    swapped = true;
                }
            }
        }
    }

    public static void sortArrayInDesc(int[] inputArray) {
        boolean swapped = true;
        int j = 0;
        int currentElementHolder = 0;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < inputArray.length - j; i++) {
                if (inputArray[i] < inputArray[i + 1]) {
                    currentElementHolder = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = currentElementHolder;
                    swapped = true;
                }
            }
        }
    }
}
