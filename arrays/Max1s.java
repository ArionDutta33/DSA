package arrays;

public class Max1s {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 0, 1 };
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (count > max) {
                max = count;
            }
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
