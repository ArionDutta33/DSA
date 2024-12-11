public class NtoOne {
    public static void printNtoOne(int count, int baseCount) {
        if (count < 1) {
            return;
        }
        System.out.println("check");
        printNtoOne(count - 1, baseCount);
    }

    public static void main(String[] args) {
        printNtoOne(4, 4);
    }
}
