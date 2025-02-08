package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class AteroidCollision {

    // // *8,-8
    // 8-8
    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = asteroids.length - 1; i >= 0; i--) {
            stack.push(asteroids[i]);
        }
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.peek() <= asteroids[i]) {
                stack.pop();
            }
            if (asteroids[i] < 0 && Math.abs(asteroids[i]) > stack.peek()) {
                stack.pop();
            }
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] check = asteroidCollision(new int[] { 8, -8 });
        System.out.println(Arrays.toString(check));
    }

}