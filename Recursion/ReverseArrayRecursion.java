import java.util.Arrays;

public class ReverseArrayRecursion {
    static void swap(int startIndex, int endIndex, int[] arr) {
        int temp = Integer.MIN_VALUE;
        temp = arr[endIndex];
        arr[endIndex] = arr[startIndex];
        arr[startIndex] = temp;
    }

    static void reverseArray(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        swap(startIndex, endIndex, arr);
        reverseArray(arr, startIndex + 1, endIndex - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
