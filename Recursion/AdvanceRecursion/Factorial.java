package AdvanceRecursion;

import java.util.ArrayList;

public class Factorial {

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        generateFactorial(n, 1, 1, result);
        return result;
    }

    public static void generateFactorial(long n, long fact, int i,
            ArrayList<Long> result) {
        if (fact > n)
            return;

        result.add(fact);
        generateFactorial(n, fact * (i + 1), i + 1, result);
    }

}
