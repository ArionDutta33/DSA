public class NtoOneBacktrack {

    static void backtrackNtoOne(int baseCount) {

        if (baseCount < 1) {
            return;
        }
        backtrackNtoOne(baseCount - 1);
        System.out.println(baseCount);
    }

    public static void main(String[] args) {
        backtrackNtoOne(5);
    }

}
