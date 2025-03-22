package revsision;

import java.util.Arrays;

public class SetMatrixZeroes2 {

    static void setZeroes(int[][] arr) {
        int[] cols = new int[arr.length];
        int[] rows = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = -1;
                    cols[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (rows[i] == -1 || cols[j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        setZeroes(new int[][] {
                { 1, 1, 1, },
                { 1, 0, 1 },
                { 1, 1, 1, }
        });
    }
}