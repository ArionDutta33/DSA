package revsision;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int lead = 1;
        int trail = 0;
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;
        while (lead < arr.length) {

            if (arr[trail] > arr[lead]) {
                trail++;
            }
            profit = arr[lead] - arr[trail];
            maxProfit = Math.max(maxProfit, profit);
            lead++;
        }
        System.out.println(maxProfit);
    }
}