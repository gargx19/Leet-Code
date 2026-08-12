class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean found = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    found = false;
                    break;
                }
            }
            if (found)
                count++;
        }
        return count;
    }
}