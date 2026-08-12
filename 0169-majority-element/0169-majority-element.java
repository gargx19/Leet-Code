class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i : nums) {
            result.put(i, result.getOrDefault(i, 0) + 1);
        }
        int n = nums.length / 2;
        int m = 0;
        for (HashMap.Entry<Integer, Integer> e : result.entrySet()) {
            if (e.getValue() > m) {
                m = e.getValue();
            }
        }
        for (HashMap.Entry<Integer, Integer> e : result.entrySet()) {
            if (e.getValue() == m) {
                return e.getKey();
            }
        }
        return 0;
    }
}