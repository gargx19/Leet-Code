class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            seen.add(n);
        }

        int start = nums[0];
        int end = nums[nums.length - 1];

        while (start < end) {
            if (!seen.contains(start)) {
                result.add(start);
            }
            start++;
        }

        return result;
    }
}
