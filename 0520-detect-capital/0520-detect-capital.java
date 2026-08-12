class Solution {
    public boolean detectCapitalUse(String word) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                count1++;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                count2++;
            }
        }

        if (count1 == 0 || count1 == word.length())
            return true;
        else if (count2 == 1) {
            if (!Character.isLowerCase(word.charAt(0))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}