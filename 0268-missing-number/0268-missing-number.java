class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                j = i;
                break;
            }
        }
        return j;
    }
}