package arrays;

public class Majority {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count++;
            } else if (element != nums[i])
                count--;
            else if (element == nums[i])
                count++;
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
    }
}