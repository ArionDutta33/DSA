package arrays.Sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = new int[high];
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    static void merge_sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 2 };
        merge_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
