class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int next = 0;
            for (int j = i + 1; j < nums.size(); j++) {
                next += nums[j];
            }
            if (next == sum) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
};