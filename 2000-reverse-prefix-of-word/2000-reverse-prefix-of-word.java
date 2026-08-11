class Solution {
    public String reversePrefix(String word, char ch) {
        if (word.contains(String.valueOf(ch))) {
            Stack<Character> st = new Stack<>();
            StringBuilder result = new StringBuilder();
            int ind = 0;
            for (int i = 0; i < word.length(); i++) {
                if (st.isEmpty()) {
                    st.push(word.charAt(i));
                    if(st.peek() == ch){
                        ind = i;
                        break;
                    }
                } else if (word.charAt(i) == ch) {
                    st.push(word.charAt(i));
                    ind = i;
                    break;
                } else {
                    st.push(word.charAt(i));
                }
            }

            while (!st.isEmpty()) {
                result.append(st.peek());
                st.pop();
            }
            for (int i = ind + 1; i < word.length(); i++) {
                result.append(word.charAt(i));
            }
            return result.toString();
        } else {
            return word;
        }
    }
}