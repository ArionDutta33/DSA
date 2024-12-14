package Hashing;

public class Why {
    static int count(int n, int key) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int value = i % 1000; // Generate values dynamically
            if (key == value) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long n = 10_000_000_000L; // 10 billion elements
        int key = 500;

        long startTime = System.currentTimeMillis(); // Start time

        int result = count((int) n, key);

        long endTime = System.currentTimeMillis(); // End time

        System.out.println("Occurrences of " + key + ": " + result);
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " seconds");
    }
}
