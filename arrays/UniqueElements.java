package arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int i = 0;
        int k = 0;
        while (i < arr.length) {
            if (arr[k] != arr[k + 1]) {
                arr[k] = arr[k + 1];
                k++;
            }
            i++;
        }
    }
}
