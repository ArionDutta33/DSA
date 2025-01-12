package revsision;

import java.util.ArrayList;

public class Union {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 6, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j])
                list.add(a[i]);
            else
                break;

            i++;
            j++;
        }
        while (i < a.length || j < b.length) {
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }
        System.out.println(list);
    }
}