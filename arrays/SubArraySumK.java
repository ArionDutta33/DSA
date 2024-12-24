public class SubArraySumK {
    static int subarrrayCount(int[] arr, int k) {
        int count = 0;
        int leftPtr = 0;
        int rightPtr = 1;
        while (leftPtr < arr.length) {
            if (arr[leftPtr] == k)
                count++;
            if (arr[leftPtr] + arr[rightPtr] < k) {
                rightPtr++;
            }
            leftPtr++;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { -5, -2, -3, 1, 2 };
        int k = -5;
        int getSubarray = subarrrayCount(arr, k);
        System.out.println(getSubarray);
    }
}
