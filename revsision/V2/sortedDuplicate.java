import java.util.Arrays;

public class sortedDuplicate {

    public static int[] duplicateSort(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[j] != arr[j - 1]) {
                i++;
                arr[i] = arr[j];
            }
            j++;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = duplicateSort(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
        System.out.println(Arrays.toString(res));
    }
}