package com.java.project.exercises.number;

public class SumOfDigitsInNumber {

    public static void main(String[] args) {
        System.out.println(calculateSumOfDigitsOfGivenNumber(123));
    }

    public static int calculateSumOfDigitsOfGivenNumber(int inputNumber){
       return String.valueOf(inputNumber).chars()
               .mapToObj(character->Character.getNumericValue((char) character))
               .mapToInt(Integer::intValue).sum();
    }
}
