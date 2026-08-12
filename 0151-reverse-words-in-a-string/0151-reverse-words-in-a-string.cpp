class Solution {
public:
    string reverseWords(string s) {
        vector<string> str;
        int i = 0;
        while (i >= 0 && i < s.length() && s[i] == ' ') {
            i++;
        }

        int j = s.length() - 1;
        while (j >= 0 && j < s.length() && s[j] == ' ') {
            j--;
        }
        for (int x = i; x <= j; x++) {
            string st = "";
            int k = x;
            int e = k;
            while (k >= 0 && k <= j && s[k] != ' ') {
                st += s[k++];
            }
            x = k;
            if (e != x)
                str.push_back(st);
        }
        reverse(str.begin(), str.end());
        string result = "";
        for (int k = 0; k < str.size(); k++) {
            result += str[k];
            if (k != str.size() - 1) {
                result += ' ';
            }
        }
        return result;
    }
};