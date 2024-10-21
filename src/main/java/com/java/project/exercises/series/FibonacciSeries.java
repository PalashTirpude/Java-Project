package com.java.project.exercises.series;

import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
            System.out.printf("Fibonacci Series  : %s%n", Arrays.toString(fibonacciSeries(20)));
    }

    /*The Fibonacci series is a sequence of numbers where each number (called a Fibonacci number) is the sum of the two preceding ones,
    usually starting with 0 and 1. The sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
    */
    public static int[] fibonacciSeries(int nthNumberInSeries){
        int[] seriesArray=new int[nthNumberInSeries];
        for(int i=0;i<seriesArray.length;i++){
            if(i==0 || i==1){
                seriesArray[i]=(i==0)?0:1;
            }else
            seriesArray[i]=seriesArray[i-1]+seriesArray[i-2];
        }
        return seriesArray;
    }
}
