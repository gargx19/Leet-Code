class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string str = "";
        int n = word1.length();
        int m = word2.length();
        if (n < m) {
            for (int i = 0; i < n; i++) {
                str += word1[i];
                str += word2[i];
            }
            for (int i = n; i < m; i++) {
                str += word2[i];
            }
        } else {
            for (int i = 0; i < m; i++) {
                str += word1[i];
                str += word2[i];
            }
            for (int i = m; i < n; i++) {
                str += word1[i];
            }
        }
        return str;
    }
};