public class PrintName {
    public static void printNames(int count, int baseCount) {
        if (count > baseCount)
            return;
        System.out.println("John Doe");
        printNames(count + 1, baseCount);

    }

    public static void main(String[] args) {
        // print the name three times
        printNames(1, 3);

    }
}
