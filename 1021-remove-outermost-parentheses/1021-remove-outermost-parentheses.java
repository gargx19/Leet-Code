class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!st.isEmpty()) {
                    result.append(ch);
                }
                st.push(ch);
            } else {
                if (st.size() > 1) {
                    result.append(ch);
                }
                st.pop();
            }
        }
        return result.toString();
    }
}