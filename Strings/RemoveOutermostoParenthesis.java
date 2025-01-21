package Strings;

public class RemoveOutermostoParenthesis {

    static String removeParenthesis(String s) {
        int count = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(')

                count++;

            else if (s.charAt(i) == ')')

                count--;

            // the only brackets we have to ignore are when count is 0 or count is 1 and
            // bracket is'("

            if ((count == 1 && s.charAt(i) == '(') || count == 0)

                continue;

            else {

                res += s.charAt(i);

            }

        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(removeParenthesis("(()())(())"));
    }
}