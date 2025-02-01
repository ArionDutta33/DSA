package revsision;

import java.util.Arrays;

public class SetMatrixZeroes {
    static void setMatrixZeroes(int[][] arr) {
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = i;
                    col[j] = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setMatrixZeroes(arr);
    }
}
