class Solution {
    public String defangIPaddr(String address) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                list.add('[');
                list.add(address.charAt(i));
                list.add(']');
            } else {
                list.add(address.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}