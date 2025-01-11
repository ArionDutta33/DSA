package revsision;

public class CountEvenDigits {
    static boolean isEven(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        int keepCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                keepCount++;

            }
        }
        System.out.println(keepCount);

    }
}
