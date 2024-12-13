import java.util.Arrays;

public class ReverseAnArray {
    static void swap(int startIndex, int endIndex, int[] arr) {
        int temp = Integer.MIN_VALUE;
        temp = arr[endIndex];
        arr[endIndex] = arr[startIndex];
        arr[startIndex] = temp;
    }

    static int[] reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {

            swap(startIndex, endIndex, arr);
            startIndex++;
            endIndex--;

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] newArray = reverseArray(arr);
        System.out.println(Arrays.toString(newArray));

    }
}
