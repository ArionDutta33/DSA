// import java.util.ArrayList;
// import java.util.Arrays;

// public class NuniqueSum {

//     public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<>();
//         int n = 5;
//         if (n % 2 != 0)
//             list.add(0);
//         for (int i = 1; i < n; i++) {
//             list.add(i);
//             list.add(-i);
//             if (list.size() >= n)
//                 break;
//         }
//         int[] arr = new int[list.size()];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = list.get(i);
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

import java.util.Arrays;

public class NuniqueSum {

    public static void main(String[] args) {
        int n = 5;
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            ans[index++] = i;
            ans[index++] = -i;
        }
        if (n % 2 != 0) {
            ans[index] = 0;
        }
        System.out.println(Arrays.toString(ans));
    }
}