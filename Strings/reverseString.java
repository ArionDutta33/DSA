package Strings;

import java.util.Arrays;

public class reverseString {
    static String reveString(char[] cleanStringArray) {
        int start = 0;
        int end = cleanStringArray.length - 1;
        while (start <= end) {
            char temp = cleanStringArray[start];
            cleanStringArray[start] = cleanStringArray[end];
            cleanStringArray[end] = temp;
            start++;
            end--;
        }
        reverseWords(cleanStringArray);
    }

    static String reverseWords(char[] arr) {
        String ans = "";

    }

    public static void main(String[] args) {
        String s = " hello world ";

        String cleanString = s.trim();
        char[] cleanStringArray = cleanString.toCharArray();
        String res = reveString(cleanStringArray);
        System.out.println(res);
    }
}