package revsision;

public class IsSortedRotated {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[(i - 1) % arr.length])
                k++;
        }
        if (k == 1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
