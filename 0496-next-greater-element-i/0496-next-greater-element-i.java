class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            if (st.isEmpty()) {
                st.push(nums2[i]);
            } else {
                while (!st.isEmpty() && st.peek() < nums2[i]) {
                    map.put(st.peek(), nums2[i]);
                    st.pop();
                }
                st.push(nums2[i]);
            }
        }

        while (!st.isEmpty()) {
            map.put(st.peek(), -1);
            st.pop();
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}