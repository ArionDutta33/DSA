package Probs;

public class StringSwap {

    static boolean inequality(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int i = 0;
        int j = 0;
        int inequalityCounter = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                inequalityCounter++;
            }
            i++;
            j++;
        }
        if (inequalityCounter != 0 && inequalityCounter != 2)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(inequality("bank", "kanb"));

    }
}