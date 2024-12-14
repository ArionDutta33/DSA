public class CheckPalindrome {

    // static boolean checkIsEqual(String name,char start)

    static boolean isPalindrome(String text, int startIndex) {
        if (startIndex >= text.length() - 1 - startIndex) {
            return true;
        }
        if (text.charAt(startIndex) != text.charAt(text.length() - 1 - startIndex)) {
            return false;
        }
        return isPalindrome(text, startIndex + 1);

    }

    public static void main(String[] args) {

        String text = "madsm";
        boolean check = isPalindrome(text, 0);
        System.out.println(check);
        // System.out.println(check);
    }
}
