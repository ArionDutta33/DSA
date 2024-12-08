package basic;

public class CountDigits {

    public static void main(String[] args) {
        int number = 1279;
        int rem = 0;
        int newNum = 0;
        while (number != 0) {
            rem = number % 10;
            newNum = newNum * 10 + rem;
            number = number / 10;
        }
        System.out.println(newNum);
    }

}
