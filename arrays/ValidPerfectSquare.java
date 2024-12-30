package arrays;

public class ValidPerfectSquare {
    static boolean isValid(int num) {

        int low = 1;
        int high = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid > num)
                high = mid - 1;
            else if (mid * mid < num)
                low = mid + 1;
            else
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        boolean check = isValid(16);
        System.out.println(check);
    }

}
