package arrays;

public class SortedRotated {
    static boolean isSortedRotated(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[(i + 1) % arr.length])
                k++;
        }
        if (k > 1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        boolean check = isSortedRotated(arr);
        System.out.println(check);
    }
}
