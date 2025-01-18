package arrays.Searching.BinarySearch;

public class NumberOfOccurences {

    static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1; // Store the first occurrence

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }

    static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1; // Store the last occurrence

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid; // Possible last occurrence
                low = mid + 1; // Move right to find the last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    static int occurences(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        // If target is not found in the array, return 0
        if (first == -1 || last == -1)
            return 0;

        return last - first + 1; // Count occurrences
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;
        int res = occurences(arr, target);
        System.out.println(res); // Output: 4
    }
}
