class Solution {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            result[i] = 0;
        }

        for (int i = 0; i < boxes.length(); i++) {
            for (int k = 0; k < i; k++) {
                if (boxes.charAt(k) == '1') {
                    result[i] += (i - k);
                }
            }
        }

        for (int i = 0; i < boxes.length() - 1; i++) {
            for (int j = i + 1; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    result[i] += (j - i);
                }
            }
        }
        return result;
    }
}