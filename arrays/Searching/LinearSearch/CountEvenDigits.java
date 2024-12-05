public class CountEvenDigits {
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;

    }

    static boolean isEven(int num) {
        int numDigits = countDigits(num);
        return numDigits % 2 == 0;
    }

    static int findNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 2, 6, 896 };
        System.out.println(findNum(nums));
    }
}
