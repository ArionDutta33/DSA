class Solution {
    public boolean isIsomorphic(String s, String t) {
        // This map contains original and replacement values
        // Example for "foo" and "bar":
        // f -> b
        // o -> a
        // o -> r (this gives false as 'o' already exists as a key)

        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!charMap.containsKey(original)) {
                // We did not find the key, meaning this is the first mapping
                if (!charMap.containsValue(replacement)) {
                    // Making sure the values are unique too
                    // Only then add
                    charMap.put(original, replacement);
                } else {
                    // If it already contains value, it is not isomorphic
                    return false;
                }
            } else {
                // If it already contains key
                char mapChar = charMap.get(original);
                if (mapChar != replacement) {
                    return false;
                }
            }
        }

        return true;
    }
}
