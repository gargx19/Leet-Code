class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            boolean found = true;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (words[i].contains(String.valueOf(brokenLetters.charAt(j)))) {
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