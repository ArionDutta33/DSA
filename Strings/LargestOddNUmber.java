package Strings;

import java.util.Arrays;

public class LargestOddNUmber {

    static String largestOddNumber(String str) {
        for (int i = str.length() - 1; i < str.length(); i--) {
            if (Character.getNumericValue(str.charAt(i)) % 2 != 0) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String number = "35427";
        System.out.println(largestOddNumber(number));

    }
}
