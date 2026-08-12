class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        vector<int> arr;
        for (int i = 0; i < nums.size(); i++) {
            arr.push_back(nums[i]);
        }
        sort(arr.begin(), arr.end());
        int ind = 0;
        if (arr[nums.size() - 2] * 2 > arr[nums.size() - 1]) {
            return -1;
        } else {
            for (int i = 0; i < nums.size(); i++) {
                if (nums[i] == arr[nums.size() - 1]) {
                    ind = i;
                }
            }
        }
        return ind;
    }
};