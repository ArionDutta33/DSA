package arrays;

public class IsSorted {
    static boolean isArraySortedAndRotated(int[] arr) {
        boolean flag = false;
        int rotatedPoint = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                flag = true;
            } else {
                flag = false;
                rotatedPoint = i - 1;
                break;
            }
        }
        if (!flag) {
            for (int i = rotatedPoint + 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    flag = true;
                } else {
                    flag = false;
                    rotatedPoint = i - 1;
                    break;
                }
            }
        }

        // sorted
        // arr[i] is not sorted

        return flag;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        boolean checkIsSorted = isArraySortedAndRotated(arr);
        System.out.println(checkIsSorted);
    }
}
