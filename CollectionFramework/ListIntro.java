package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.InternationalFormatter;

public class ListIntro { // Renamed the class to CustomList
    public static void main(String[] args) {
        // Create an ArrayList of Integer type
        List<String> list = new ArrayList<>();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("pineapple");
        list.add("strawbery");
        // normal for loop
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        // for each loop
        // for (String fruit : list) {
        // System.out.println("fruit is ->" + fruit);
        // }

        // Iterator
        // Iterator<String> fruit = list.iterator();
        // while (fruit.hasNext()) {
        // System.out.println(fruit.next());
        // }

        // list iterator
        Iterator<String> fruit = list.listIterator();
        while (fruit.hasNext()) {
            System.out.println(fruit.next());
        }

    }
}
