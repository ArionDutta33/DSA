public class SumOfNFunctional {
    static int getSumOfN(int number) {
        if (number == 0) {
            return 0;
        }
        return number + getSumOfN(number - 1);

    }

    public static void main(String[] args) {
        int res = getSumOfN(10);
        System.out.println(res);
    }
}
