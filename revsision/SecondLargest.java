package revsision;

public class SecondLargest {
    //

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 10 };
        int max = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max)
                secondLargest = arr[i];

        }
        System.out.println(secondLargest);
    }

}
