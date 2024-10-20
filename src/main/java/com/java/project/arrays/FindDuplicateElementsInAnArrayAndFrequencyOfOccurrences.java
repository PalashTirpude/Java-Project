package com.java.project.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElementsInAnArrayAndFrequencyOfOccurrences {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 1, 6, 2, 7, 8, 3, 7, 1, 5, 6};
        findDuplicateElementsInAnArrayAndFrequencyOfOccurrences(array);

    }

    public static void findDuplicateElementsInAnArrayAndFrequencyOfOccurrences(int[] inputArray) {
        HashMap<Integer, Integer> frequencyOfOccurrences = new HashMap<>();
        System.out.printf("Given Array : %s%n", Arrays.toString(inputArray));
        for (int currentElement : inputArray) {
            frequencyOfOccurrences.put(currentElement, frequencyOfOccurrences.getOrDefault(currentElement, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> currentValueFrequency : frequencyOfOccurrences.entrySet()) {
            if (currentValueFrequency.getValue() > 1) {
                System.out.printf("Duplicate Element found : %s, Frequency of occurrence : %s%n", currentValueFrequency.getKey(), currentValueFrequency.getValue());
            }
        }
    }
}
