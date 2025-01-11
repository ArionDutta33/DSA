import java.util.HashMap;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            map.put(i, digits[i]);
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            max = Math.max(digits[i], max);
        }
        max = max + 1;
        int count = 0;
        while (max != 0) {
            max = max / 10;
            map.put(max, null)
            count++;
        }
        int[] res = new int[map.size() + count];
        System.out.println(res.length);
    }
}
