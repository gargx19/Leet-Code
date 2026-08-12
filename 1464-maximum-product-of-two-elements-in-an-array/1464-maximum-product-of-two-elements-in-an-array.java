class Solution {
    public int maxProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]--;
        }

        int prod = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] * nums[j]) > prod) {
                    prod = (nums[i] * nums[j]);
                }
            }
        }
        return prod;
    }
}