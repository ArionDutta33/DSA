package revsision;

public class OneToN2 {
    static void oneToN(int number, int target) {
        if (number > target) {
            return;
        }
        System.out.println(number);
        oneToN(number + 1, target);
    }

    public static void main(String[] args) {
        oneToN(1, 10);
    }
}
