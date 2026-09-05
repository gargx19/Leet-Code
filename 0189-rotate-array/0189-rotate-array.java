class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int j = 0;
        k = k % nums.length;
        if (k == 0)
            return;
        for (int i = nums.length - k; i < nums.length; i++) {
            arr[j++] = nums[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            arr[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}