package Strings;

import java.util.HashMap;

public class Ransome {
    static void ransom(String ransomeNote, String magazine) {
        // hashing magazine and ransome note
        HashMap<Character, Integer> ransomeNoteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < ransomeNote.length(); i++) {
            ransomeNoteMap.put(ransomeNote.charAt(i), ransomeNoteMap.getOrDefault(ransomeNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        System.out.println(ransomeNoteMap);
        System.out.println(ransomeNoteMap.equals(magazineMap));
        System.out.println("between");
        System.out.println(magazineMap);
    }

    public static void main(String[] args) {
        ransom("aab", "baa");
    }
}
