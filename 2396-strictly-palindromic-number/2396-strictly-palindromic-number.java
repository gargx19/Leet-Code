class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            String forward = "";
            String reverse = "";
            int k = n;
            while (k != 0) {
                forward += 
                k /= i;
            }

            for (int j = forward.length() - 1; j >= 0; j--) {
                reverse += forward.charAt(j);
            }

            if (!forward.equals(reverse))
                return false;
        }
        return true;
    }
}