package arrays;

public class StockBuySell {
    static int getMaxProfit(int[] arr) {
        int leftPtr = 0;// buy
        int rightPtr = 1;// sell
        int maxProfit = 0;
        int profit = Integer.MIN_VALUE;
        while (rightPtr < arr.length) {
            // check if profitable
            if (arr[leftPtr] < arr[rightPtr]) {
                profit = arr[rightPtr] - arr[leftPtr];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                leftPtr = rightPtr;
            }
            rightPtr++;

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(getMaxProfit(arr));
    }

}