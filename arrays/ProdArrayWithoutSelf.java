package arrays;

import java.util.Arrays;

public class ProdArrayWithoutSelf {

    static void prod(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            ans[i] = arr[i - 1] * ans[i - 1];
        }
        int suffix = 1;
        for (int i = ans.length - 2; i >= 0; i--) {
            suffix *= arr[i + 1];
            ans[i] *= suffix;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        prod(new int[] { 1, 2, 3, 4 });
    }
}