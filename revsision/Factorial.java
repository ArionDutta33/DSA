package revsision;

public class Factorial {
    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        int[] arr = new int[2];
        for (int i = 0; i < args.length; i++) {
            int ans = arr[i];
        }
    }
}
