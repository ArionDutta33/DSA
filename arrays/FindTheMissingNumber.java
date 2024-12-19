package arrays;

public class FindTheMissingNumber {
    static int missingNumber(int[] arr) {
        int rangeXor = 0;
        int arrayXor = 0;
        int resultXor = 0;
        for (int i = 0; i < arr.length; i++) {
            rangeXor = rangeXor ^ i;
        }
        for (int j = 1; j < arr.length; j++) {
            arrayXor = arrayXor ^ arr[j];
        }
        resultXor = rangeXor ^ arrayXor;
        return resultXor;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int missing = missingNumber(arr);
        System.out.println(missing);
    }
}
