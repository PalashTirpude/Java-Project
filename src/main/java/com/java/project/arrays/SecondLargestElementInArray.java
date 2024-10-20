package com.java.project.arrays;

public class SecondLargestElementInArray {

    public static void main(String[] args) {

        int[] array = new int[]{10, 5, 21, -5, 11, -20, 100};

        int largestValue = array[0];
        int secondLargestValue = array[0];

        for (int iteratorCurrentValue : array) {
            if (iteratorCurrentValue > largestValue){
                secondLargestValue=largestValue;
                largestValue = iteratorCurrentValue;
            }
        }

        System.out.printf("Largest value in an array is : %s%n", largestValue);
        System.out.printf("Second Largest value in an array is : %s%n", secondLargestValue);
    }
}
