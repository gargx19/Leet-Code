class Solution {
    public int findPeakElement(int[] nums) {
        int index = 0;
        if (nums.length > 1) {
            if (nums[0] > nums[1]) {
                index = 0;
            }
            if (nums[nums.length - 2] < nums[nums.length - 1]) {
                index = nums.length - 1;
            }
            for (int i = 1; i < nums.length - 1; i++) {
                if ((nums[i - 1] < nums[i]) && (nums[i] > nums[i + 1])) {
                    index = i;
                }
            }
        }
        return index;
    }
}