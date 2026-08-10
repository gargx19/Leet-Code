class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                r++;
            } else {
                r--;
            }
            if (r == 0) {
                sum++;
            }
        }
        return sum;
    }
}