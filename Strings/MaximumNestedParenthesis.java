package Strings;

public class MaximumNestedParenthesis {
    static int maxParenthesis(String str) {
        int maxNesting = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else if (str.charAt(i) == ')') {
                counter--;
            }
            maxNesting = Math.max(maxNesting, counter);
        }
        return maxNesting;
    }

    public static void main(String[] args) {
        System.out.println(maxParenthesis("()(())((()()))"));
    }
}
