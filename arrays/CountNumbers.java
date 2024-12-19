package arrays;

public class CountNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1289;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
