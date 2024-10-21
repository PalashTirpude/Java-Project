package com.java.project.exercises.strings;

public class SwapStrings {

    public static void main(String[] args) {
        String str1="Laptop";
        String str2="Charge";
        System.out.printf("Original Strings : %s %s%n",str1,str2);
        String tempValueHolder=str1;
        str1=str2;
        str2=tempValueHolder;
        System.out.printf("Swapped Strings :  %s %s%n",str1,str2);
    }
}
