package revsision;

import java.util.Arrays;

public class ArrayPermuation {
    static int[] permuationArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[arr[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] res = permuationArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
