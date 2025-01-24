package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strings = { "tan", "nat", "tea", "ate", "bat", "eat" };

        // HashMap to store the sorted string as key and list of anagrams as value
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // Step 1: Process each string and group anagrams
        for (int i = 0; i < strings.length; i++) {
            char[] arr = strings[i].toCharArray();
            Arrays.sort(arr); // Sort the characters of the string
            String sortedString = new String(arr); // Convert the sorted char array back to string

            // If the sorted string is not in the map, add it with a new ArrayList
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            // Add the original string to the corresponding sorted string's list
            map.get(sortedString).add(strings[i]);
        }

        // Step 2: Convert the grouped anagrams into a list of lists
        ArrayList<ArrayList<String>> resultList = new ArrayList<>(map.values());

        // Print the result
        for (ArrayList<String> group : resultList) {
            System.out.println(group);
        }
    }
}
