class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            while (n != 0) {
                temp.add(n % 10);
                n /= 10;
            }
            for (int i = temp.size() - 1; i >= 0; i--) {
                list.add(temp.get(i));
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}