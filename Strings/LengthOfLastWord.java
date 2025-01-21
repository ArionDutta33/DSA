package Strings;

public class LengthOfLastWord {
    static int lengthOfLastWord(String string) {
        int count = 0;
        String cleanString = string.trim();
        for (int i = cleanString.length() - 1; i >= 0; i--) {
            if (cleanString.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
