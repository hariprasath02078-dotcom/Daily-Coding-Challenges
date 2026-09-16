import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] a = (s1 + " " + s2).split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : a) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> ans = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}