package com.java.project.exercises.strings;

public class ReverseString {

    public static void main(String[] args) {

        System.out.printf("Original String : %s, Reversed String : %s","January",reverseString("January"));
    }

    public static String reverseString(String inputString){
        char[] splitStringIntoArrayOfCharacter=inputString.toCharArray();
        StringBuilder inputStringBuilder = new StringBuilder();
        for(int i = splitStringIntoArrayOfCharacter.length-1; i>=0; i--){
            inputStringBuilder.append(splitStringIntoArrayOfCharacter[i]);
        }
        return inputStringBuilder.toString();
    }
}
