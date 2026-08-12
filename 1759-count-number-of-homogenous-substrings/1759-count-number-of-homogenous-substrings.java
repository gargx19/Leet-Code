class Solution {
    public int countHomogenous(String s) {
        long ans = 1;
        long count = 1;
        int MOD = 1_000_000_007;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            ans = (ans + count) % MOD;
        }

        return (int) ans;
    }
}