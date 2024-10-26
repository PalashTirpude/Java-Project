package com.java.project.exercises.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        String sampleString="Natural resources are very important";
        findDuplicateCharactersInAString(sampleString);

    }

    public static void findDuplicateCharactersInAString(String inputString){
        HashMap<Character, Integer> frequencyOfOccurrences = new HashMap<>();
        for (char currentElement : inputString.toCharArray()) {
            frequencyOfOccurrences.put(currentElement, frequencyOfOccurrences.getOrDefault(currentElement, 0) + 1);
        }

        for (Map.Entry<Character, Integer> currentValueFrequency : frequencyOfOccurrences.entrySet()) {
            if (currentValueFrequency.getValue() > 1) {
                System.out.printf("Duplicate Character found : %s, Frequency of occurrence : %s%n", currentValueFrequency.getKey(), currentValueFrequency.getValue());
            }
        }
    }
}
