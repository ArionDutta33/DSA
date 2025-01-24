package arrays;

public class MedianSortedArray {
    static void median(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        while (i < arr1.length || i < arr2.length) {
            if (arr1[i] < arr2[i]) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[i];
            }
            i++;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        median(new int[] { 1, 3 }, new int[] { 2 });
    }
}
