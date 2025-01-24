package arrays.Searching.BinarySearch;

public class GuessTheNumber {
    static int guess(int num, int target) {
        if (num > target)
            return -1;
        else if (num < target)
            return 1;
        else
            return 0;

    }

    static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            System.out.println("binary search");
            int mid = low + (high - low) / 2;
            System.out.println("mid" + mid);
            int guessNum = guess(mid, 6);
            if (guessNum == -1) {
                System.out.println("in -1");

                // higher
                high = mid - 1;
            } else if (guessNum == 1) {
                // lower
                System.out.println("in 1");
                low = mid + 1;
            } else {
                System.out.println(mid);
                System.out.println(guessNum);
                // this is the number
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
