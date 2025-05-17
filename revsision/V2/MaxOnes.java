public class MaxOnes {
    public static int maxOnes(int[] arr) {
        int maxCount = Integer.MIN_VALUE;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                oneCount++;
                maxCount = Math.max(oneCount, maxCount);
            } else {
                oneCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
    }
}
