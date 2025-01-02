package revsision;

public class RichestCustomer {

    static int richestCustomer(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };
        int wealth = richestCustomer(arr);
        System.out.println(wealth);
    }
}