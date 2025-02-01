package Strings;

import java.util.*;

public class ValidAdjacentPairs {
    public static void main(String[] args) {
        String input = "2523533";
        System.out.println(findValidPairs(input));
    }

    // contest
    public static String findValidPairs(String num) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char digit : num.toCharArray()) {
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        for (int i = 0; i < num.length() - 1; i++) {
            char first = num.charAt(i);
            char second = num.charAt(i + 1);

            if (first != second) {
                if (frequencyMap.get(first) == Character.getNumericValue(first) &&
                        frequencyMap.get(second) == Character.getNumericValue(second)) {
                    result.append(first).append(second);
                }
            }
        }

        return result.toString();
    }
}
