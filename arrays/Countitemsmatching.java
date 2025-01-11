// import java.util.Arrays;

// public class Countitemsmatching {

//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 1, 0 },
//                 { 1, 0, 1 },
//                 { 0, 0, 0 }
//         };
//         // in first pass we reverse each row
//         for (int i = 0; i < arr.length; i++) {
//             int startIndex = 0;
//             int endIndex = arr[i].length - 1;
//             while (startIndex < endIndex) {
//                 int temp = arr[i][startIndex];
//                 arr[i][startIndex] = arr[i][endIndex];
//                 arr[i][endIndex] = temp;
//                 startIndex++;
//                 endIndex--;
//             }
//         }
//         // the array has been flipped now change 0s to 1s and 1s to 0s
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = arr[i][j] == 1 ? 0 : 1;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.println(arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

public class Countitemsmatching {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        for (int[] elem : arr) {
            int startIndex = 0;
            int endIndex = elem.length - 1;
            while (startIndex < endIndex) {
                int temp = elem[startIndex];
                elem[startIndex] = elem[endIndex] ^ 1;
                elem[endIndex] = temp ^ 1;
            }
        }

    }
}