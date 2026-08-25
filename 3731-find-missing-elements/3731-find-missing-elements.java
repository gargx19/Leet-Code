class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        // int end = nums[nums.length - 1];

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            seen.add(n);
        }

        int start = nums[0];
        int end = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(start > nums[i]){
                start = nums[i];
            }
            if(end < nums[i]){
                end = nums[i];
            }
        }

        while (start < end) {
            if (!seen.contains(start)) {
                result.add(start);
            }
            start++;
        }

        return result;
    }
}