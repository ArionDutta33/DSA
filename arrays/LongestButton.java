package arrays;

public class LongestButton {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 5 }, { 3, 9 }, { 1, 15 } };
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j = j + 2) {
                min = arr[i][j];
                res = min - arr[i][1];
                if (res < min) {
                    min = res;
                }
            }
        }
        System.out.println(arr[3][0]);
    }
}
