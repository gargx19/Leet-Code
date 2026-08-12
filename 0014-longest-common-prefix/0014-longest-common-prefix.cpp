class Solution {
public:
    string longestCommonPrefix(vector<string>& str) {
        string bag = str[0];
        for (int i = 1; i < str.size(); ++i) {
            int j = 0;
            while (j < bag.size() && j < str[i].size() && bag[j] == str[i][j]) {
                j++;
            }
            bag = bag.substr(0, j);
        }
        return bag;
    }
};