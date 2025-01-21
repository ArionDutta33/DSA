package Strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortStringFrequency {
    static String sort(String s) {
        StringBuilder res = new StringBuilder();
        res.append(s);
        res.reverse();
        return res.toString();

    }

    public static void main(String[] args) {
        System.out.println(sort("eeeeoollvtdc"));
    }
}
