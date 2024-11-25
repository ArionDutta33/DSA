package arrays.Searching.LinearSearch;

public class Intro {
    public static boolean doesExist(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // in an array find whether 14 exists or not
        int[] arr = { 18, 12, 9, 14, 77, 50 };
        boolean isExisting = doesExist(arr, 10);
        if (isExisting) {
            System.out.println("The key exists");
        } else {
            System.out.println("The key does not exist");
        }
    }
}
