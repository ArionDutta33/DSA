public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 2 };
        int ans = 2;

        for (int i = 0; i < arr.length; i++) {
            int check = arr[i] ^ ans;
            if (check == 0) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
