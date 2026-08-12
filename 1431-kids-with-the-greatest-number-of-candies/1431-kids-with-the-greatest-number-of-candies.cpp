class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> result;
        int m = 0;
        for (int i = 0; i < candies.size(); i++) {
            if (m < candies[i]) {
                m = candies[i];
            }
        }
        for (int i = 0; i < candies.size(); i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= m)
                result.push_back(true);
            else
                result.push_back(false);
        }
        return result;
    }
};