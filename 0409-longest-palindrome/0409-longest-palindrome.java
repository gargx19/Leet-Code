class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int m = 0;
        boolean odd = false;
        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                m += entry.getValue();
            } else {
                m += entry.getValue() - 1;
                odd = true;
            }
        }
        if (odd)
            return m + 1;

        return m;
    }
}