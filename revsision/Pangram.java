package revsision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    static boolean isPangram(String sentence) {
        // Set<Character> set = new HashSet<>();
        // char[] senarr = sentence.toCharArray();
        // for (char i = 97; i <= 122; i++) {
        // set.add(i);
        // }
        // for (char c : senarr) {
        // if (!set.contains(c)) {
        // return false;
        // }
        // }
        // return true;
        // Set<Character> set = new HashSet<>();
        // char[] senarr = sentence.toCharArray();
        // for (int i = 0; i < senarr.length; i++) {
        // set.add(senarr[i]);
        // }
        // for (char i = 97; i <= 122; i++) {
        // if (!set.contains(i)) {
        // return false;
        // }

        // }
        // return true;
        if (sentence.length() < 26)
            return false;
        for (int i = 1; i <= 26; i++)
            if (sentence.indexOf((char) i + 96) < 0)
                return false;
        return true;

    }

    public static void main(String[] args) {
        String sentence = "leetcode";
        boolean check = isPangram(sentence);
        System.out.println(check);
    }
}
