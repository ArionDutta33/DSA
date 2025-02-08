package Stacks;

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("D")) {
                stack.push(stack.peek() * 2); // Double the last valid score
            } else if (op.equals("C")) {
                stack.pop(); // Remove the last valid score
            } else if (op.equals("+")) {
                // Get the last two elements without removing them
                int top = stack.get(stack.size() - 1);
                int secondTop = stack.get(stack.size() - 2);

                stack.push(top + secondTop); // Push the sum of the last two scores
            } else {
                stack.push(Integer.parseInt(op)); // Convert string to integer and push
            }
        }

        // Sum all elements in the stack
        int res = 0;
        for (int num : stack) {
            res += num;
        }
        return res;
    }
}
