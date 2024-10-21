package com.java.project.exercises.number;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(123));
    }


    /*

    An Armstrong number is a special type of number that is equal to the sum of its own digits,
    each raised to the power of the total number of digits in that number.

    Explanation:
    Digits and Powers: Take a number, and look at each of its digits. Raise each digit to the power of the total number of digits in that number.

    Summing Up: After raising the digits to the power, add all these values together.

    Comparison: If the sum you calculated is the same as the original number, then it’s called an Armstrong number.
    */

    public static boolean isArmstrongNumber(int inputNumber){
        List<Integer> digits=new ArrayList<>();
        for(char currentCharacter:String.valueOf(inputNumber).toCharArray()){
            digits.add(Character.getNumericValue(currentCharacter));
        }
        int calculateNumber=0;
        for(int i=0;i<digits.size();i++){
            calculateNumber+= (int) Math.pow(digits.get(i),digits.size());
        }
        return calculateNumber==inputNumber;
    }
}
