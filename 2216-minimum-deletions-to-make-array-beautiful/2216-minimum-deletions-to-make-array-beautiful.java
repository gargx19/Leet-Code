class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        int x = 0;
        for (int n : nums) {
            if (st.isEmpty()) {
                st.push(n);
                x++;
            } else {
                if (x % 2 == 0) {
                    x++;
                    st.push(n);
                } else {
                    if (st.peek() == n) {
                        sum++;
                    } else {
                        st.push(n);
                        x++;
                    }
                }
            }
        }
        if (x % 2 != 0)
            sum++;

        return sum;
    }
}