import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayLeader {

    public static void main(String[] args) {
        int[] arr = { 61, 61, 17 };
        int max = arr[arr.length - 1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length - 1]);
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i - 1] >= arr[i] && arr[i - 1] >= max) {
                list.add(arr[i - 1]);
                max = arr[i - 1];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}