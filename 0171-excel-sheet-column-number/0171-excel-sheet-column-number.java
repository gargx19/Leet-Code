class Solution {
    public int titleToNumber(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum * 26 + (str.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}