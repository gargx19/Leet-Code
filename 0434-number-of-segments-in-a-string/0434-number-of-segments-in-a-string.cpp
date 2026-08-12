class Solution {
public:
    int countSegments(string s) {
        vector<string> result;
        int i = 0;
        while (i < s.length()) {
            string st = "";
            while (i <= s.length() && s[i] == ' ') {
                i++;
            }
            while (i < s.length() && s[i] != ' ') {
                st += s[i];
                i++;
            }
            if (st != "") {
                result.push_back(st);
            }
        }
        return result.size();
    }
};