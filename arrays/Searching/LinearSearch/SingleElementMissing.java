import java.util.Arrays;

public class SingleElementMissing {
    static int getNotRepeated(int[] arr) {

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3 };
        int ans = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            if (ans != 0) {
                res = ans;
            }
        }
        System.out.println(res);
    }
}
