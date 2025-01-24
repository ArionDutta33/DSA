package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EncodeDecode {
    public static String encode(List<String> strs) {
        // Input: ["neet","code","love","you"]
        // Output:["neet","code","love","you"]
        // neetcodeloveyou
        StringBuilder resString = new StringBuilder();
        // neet4#code4#loves5#you#3
        for (int i = 0; i < strs.size(); i++) {
            resString.append(strs.get(i)).append(strs.get(i).length()).append("#");
        }

        return resString.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        String decodedString = "";
        for (int i = 0; i < str.length(); i++) {
            // neet#code#loves#you#
            if (str.charAt(i) != '#') {
                decodedString += str.charAt(i);
            } else {

                list.add(decodedString);
                decodedString = "";
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(encode(List.of("neet", "code", "love", "you")));
        // System.err.println(decode("neet#code#loves#you#"));
    }
}
