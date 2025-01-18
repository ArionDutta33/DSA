package Strings;

import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        System.out.println(map);
        System.out.println(map2);
        if (map.equals(map2)) {
            System.out.println("equl");
        }
    }
}
