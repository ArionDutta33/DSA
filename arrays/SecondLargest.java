package arrays;

public class SecondLargest {
    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                if (arr[i] > secondLargest)
                    secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int secLargest = secondLargest(arr);
        System.out.println(secLargest);
    }
}
