package Probs;

public class ContainingWater {

    static int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int area = (right - left) * Math.min(arr[left], arr[right]);
            if (arr[left] > arr[right]) {
                right--;
            } else {
                left++;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }
}