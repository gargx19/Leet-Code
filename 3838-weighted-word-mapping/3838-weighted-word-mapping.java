class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            int w = 0;
            for (int j = 0; j < words[i].length(); j++) {
                w += weights[words[i].charAt(j) - 'a'];
            }

            result += (char) (122 - (w % 26));
        }
        return result;
    }
}