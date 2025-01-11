package arrays;

public class RemoveElement {
    static int removeElement(int[] arr, int val) {
        int i = 0;
        int idx = 0;
        while (i < arr.length) {
            if (arr[i] != val) {
                arr[idx] = arr[i];
                idx++;
            }
            i++;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int res = removeElement(arr, val);
        System.out.println(res);
    }
}