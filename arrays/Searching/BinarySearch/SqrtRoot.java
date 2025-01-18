package arrays.Searching.BinarySearch;

public class SqrtRoot {
    // 1,2,3,4,5
    // 1^2=1 8>1
    // 2^2=4
    static int sqrtRoot(int x) {
        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (x > mid * mid) {
                start = mid + 1;
            } else if (x < mid * mid) {
                end = mid - 1;
            } else {
                return Math.round(mid);
            }

        }
        return Math.round(end);
    }

    public static void main(String[] args) {
        System.out.println(sqrtRoot(2147395599));

    }
}
