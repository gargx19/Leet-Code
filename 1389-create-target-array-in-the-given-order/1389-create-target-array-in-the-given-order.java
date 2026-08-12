class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            result.add(index[i], nums[i]);
        }
        int[] arr = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}