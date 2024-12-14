public class NthFibinacci {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13....
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = -1;
        sum = firstNumber + secondNumber;
        for (int i = 1; i < 3; i++) {
            firstNumber = secondNumber;
            secondNumber = sum;
            sum = firstNumber + secondNumber;
        }
        System.out.println(firstNumber);
    }
}
