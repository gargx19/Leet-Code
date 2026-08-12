class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(ch);
            } else {
                if (ch == st.peek()) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        String str = "";
        String result = "";
        while (!st.isEmpty()) {
            str += st.peek();
            st.pop();
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}