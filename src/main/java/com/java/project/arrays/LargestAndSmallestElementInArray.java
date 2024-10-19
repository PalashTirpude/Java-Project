package com.java.project.arrays;

public class LargestAndSmallestElementInArray {

    public static void main(String[] args) {

        int[] array= new int[]{10,5,21,-5,11,-20,100};

        int largestValue=array[0];
        int smallestValue=array[0];

        for(int iteratorCurrentValue : array){
            if(iteratorCurrentValue>largestValue)
                largestValue=iteratorCurrentValue;
            if(iteratorCurrentValue<smallestValue)
                smallestValue=iteratorCurrentValue;
        }

        System.out.printf("Largest value in an array is : %s%n",largestValue);
        System.out.printf("Smallest value in an array is : %s%n",smallestValue);
    }
}
