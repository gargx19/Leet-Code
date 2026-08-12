class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        int j = 0;
        for (int i = nums1.length; i < n; i++) {
            nums[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums);
        if (n % 2 != 0) {
            return nums[n / 2];
        } else {
            double a = nums[n / 2];
            double b = nums[n / 2 - 1];
            return (a + b) / 2;
        }
    }
}