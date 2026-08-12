class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        vector<int> result;
        for (int i = 0; i < accounts.size(); i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].size(); j++) {
                sum += accounts[i][j];
            }
            result.push_back(sum);
        }
        sort(result.begin(), result.end());
        return result[result.size() - 1];
    }
};