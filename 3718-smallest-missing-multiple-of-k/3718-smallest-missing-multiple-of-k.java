class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            seen.add(n);
        }
        int n = k;
        while (seen.contains(n)) {
            n += k;
        }
        return n;
    }
}