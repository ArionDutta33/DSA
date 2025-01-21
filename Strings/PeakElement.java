package Strings;

import arrays.Input;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        // if only one element return that element
        if (nums.length == 1)
            return nums[0];
        // remove first and last element
        if (nums[0] > nums[1])
            return nums[0];
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums[nums.length - 1];

        // start from second and secondlast element
        int start = 1;
        int end = nums.length - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            if (nums[mid] > nums[mid - 1]) {
                // we are in the increasing part so search to right
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                // we are in the decreasing part search left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
    }
}
