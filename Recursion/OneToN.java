public class OneToN {
    public static void printNumbers(int count, int baseCount) {
        if (count > baseCount) {
            return;
        }
        System.out.println(count);
        printNumbers(count + 1, baseCount);
    }

    public static void main(String[] args) {
        printNumbers(1, 4);
    }
}
