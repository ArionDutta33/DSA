package Strings;

public class ValidPalindromeII {

    static boolean isValidPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end - start)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("aba"));
    }
}