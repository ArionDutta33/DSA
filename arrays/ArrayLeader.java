import java.util.ArrayList;

public class ArrayLeader {
    // [16, 17, 4, 3, 5, 2]
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int k = 0;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;// a leader
        while (k < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                flag = false;
                i++;
            } else {
                list.add(i);
            }
            k++;
        }
        System.out.println(list);
    }

}
