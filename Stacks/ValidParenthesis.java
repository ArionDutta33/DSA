package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParenthesis {
    static boolean validParenthesis(String s) {
        Deque<Character> stack = new ArrayDeque();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && ((s.charAt(i) == ')' && stack.peek() == '(')
                    || (s.charAt(i) == '}' && stack.peek() == '{')
                    || (s.charAt(i) == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validParenthesis("]"));
    }
}
