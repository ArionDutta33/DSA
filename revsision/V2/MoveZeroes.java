import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0 && arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = moveZeroes(new int[] { 0, 1, 0, 3, 12 });
        System.out.println(Arrays.toString(res));
    }
}
