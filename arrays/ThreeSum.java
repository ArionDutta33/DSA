package arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    static void threeSum(int[] arr) {
        int currSum = arr[0];
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        List<List<Integer>> resList = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {

            currSum += arr[i];
            list.add(arr[i]);

            if (currSum == 0) {
                resList.add(list);
                list.clear();
                currSum = arr[i];
            }
        }
        System.out.println(resList);
    }

    public static void main(String[] args) {
        threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
    }
}