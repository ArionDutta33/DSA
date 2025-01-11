package revsision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatchingRule {
    public static void main(String[] args) {
        // String[][] items = {
        // { "phone", "blue", "pixel" },
        // { "computer", "silver", "lenovo" },
        // { "phone", "gold", "iphone" }
        // };
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));
        String ruleKey = "color";
        String ruleValue = "silver";
        int count = 0;
        switch (ruleKey) {
            case "color":
                for (String[] strings : items) {
                    if (strings[1] == ruleValue) {
                        count++;
                    }
                }
                break;
            case "type":
                for (String[] strings : items) {
                    if (strings[0] == ruleValue)
                        count++;
                }
                break;
            case "name":
                for (String[] strings : items) {
                    if (strings[2] == ruleValue)
                        count++;

                }
                break;

            default:
                break;
        }
        System.out.println(count);
    }
}
