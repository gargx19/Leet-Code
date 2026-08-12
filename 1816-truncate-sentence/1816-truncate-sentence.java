class Solution {
    public String truncateSentence(String s, int k) {
        String[] result = s.split(" ");
        String r = "";
        for(int i = 0; i < k; i++){
            r += result[i] + " ";
        }
        return r.trim();
    }
}