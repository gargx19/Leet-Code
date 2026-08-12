class Solution {
public:
    bool isPalindrome(string s) {
        string st = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z') || (isdigit(s[i]))) {
                st += tolower(s[i]);
            }
        }

        int left = 0, right = st.length() - 1;
        while (left <= right) {
            if (st[left] != st[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
};