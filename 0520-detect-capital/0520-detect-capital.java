class Solution {
    public boolean detectCapitalUse(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        // All capital
        if (count == word.length()) {
            return true;
        }

        // All small
        if (count == 0) {
            return true;
        }

        // Only first letter capital
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}