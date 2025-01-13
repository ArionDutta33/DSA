package revsision;

public class OneToN {
    static void printNos(int counter) {
        if (counter < 1)
            return;
        printNos(counter - 1);
        System.out.println(counter);
    }

    public static void main(String[] args) {
        printNos(10);
    }
}