public class NthUsingRecursion {
    static int fibonaacci(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }
        return fibonaacci(number - 1) + fibonaacci(number - 2);
    }

    public static void main(String[] args) {
        int number = 4;
        int res = fibonaacci(number);
        System.out.println(res);
    }
}
