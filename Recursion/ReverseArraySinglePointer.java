import java.util.Arrays;

public class ReverseArraySinglePointer {
    static void swap(int startIndex, int[] arr) {
        int temp = Integer.MIN_VALUE;
        temp = arr[startIndex];
        arr[startIndex] = arr[(arr.length - 1) - startIndex];
        arr[(arr.length - 1) - startIndex] = temp;

    }

    static void reverseArray(int startIndex, int[] arr) {
        if (startIndex >= arr.length / 2) {
            return;
        }

        swap(startIndex, arr);
        reverseArray(startIndex + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        reverseArray(0, arr);
        System.out.println(Arrays.toString(arr));
    }
}
