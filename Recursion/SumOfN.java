public class SumOfN {
    // !parameterised
    static void getSum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        getSum(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        getSum(i, sum);
    }
}
