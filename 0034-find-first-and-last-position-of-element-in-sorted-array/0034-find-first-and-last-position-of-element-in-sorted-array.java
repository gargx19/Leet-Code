class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] == target && nums[right] == target){
                arr[0] = left;
                arr[1] = right;
                break;
            }else if(nums[left] == target){
                right--;
            }else{
                left++;
            }
        }
        return arr;
    }
}