public class OneToNBacktrack {
    static void backtrackOnetoN(int baseCount) {

        if (baseCount > 5) {
            return;
        }
        backtrackOnetoN(baseCount + 1);
        System.out.println(baseCount);
    }

    public static void main(String[] args) {
        backtrackOnetoN(1);
    }
}
