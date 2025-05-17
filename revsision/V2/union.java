import java.util.Arrays;

public class union {

    public static int[] unionList(int[] arr1, int[] arr2) {
        int j = 0;
        int i = 0;
        int k = 0;
        int[] res = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                k++;
            }
            i++;
            j++;
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = unionList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, new int[] { 2, 3, 4, 4, 5, 11, 12 });
        System.out.println(Arrays.toString(res));
    }
}