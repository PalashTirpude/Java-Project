package com.java.project.arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 21, -5, 11, -20, 100};
        System.out.printf("Original array --> %s%n",Arrays.toString(array));
        System.out.printf("Reversed array using Logic 1 --> %s%n",Arrays.toString(reverseArrayLogic1(array)));

        reverseArrayLogic2(array);
        System.out.printf("Reversed array using Logic 2 --> %s%n",Arrays.toString(array));
    }

    public static int[] reverseArrayLogic1(int[] inputArray){
        int arraySize=inputArray.length;
        int[] reversedArray= new int[arraySize];
        for(int i=0;i<arraySize;i++){
            reversedArray[arraySize-(i+1)]=inputArray[i];
        }
        return reversedArray;
    }

    public static void reverseArrayLogic2(int[] inputArray){
        int startElementIndex =0;
        int endElementIndex =inputArray.length-1;
        while(startElementIndex < endElementIndex){
            int elementToBeSwappedHolder=inputArray[endElementIndex];
            inputArray[endElementIndex]=inputArray[startElementIndex];
            inputArray[startElementIndex]=elementToBeSwappedHolder;
            startElementIndex++;
            endElementIndex--;
        }
    }
}
