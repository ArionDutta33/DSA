public class SubarraywithCondition {
    public static void main(String[] args) {
        int[] arr = { -1, -4, -1, 4 };
        int l = 0;
        int b;
        int r;
        float divres = 0;

        int subArrayCount = 0;
        while (l < arr.length - 2) {
            b = l + 1;
            r = l + 2;
            System.out.println("sum" + (arr[l] + arr[r]));
            System.out.println("division" + arr[b] / 2);
            divres = arr[b] / 2;
            if ((arr[l] + arr[r]) == divres) {
                subArrayCount++;
            }
            l++;

        }
        System.out.println(subArrayCount);
    }
}