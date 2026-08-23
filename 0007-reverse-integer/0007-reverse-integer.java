class Solution {
    public int reverse(int x) {
        long temp = x;
        long newDigit = 0;
        if (temp < 0) {
            temp *= -1;
        }
        while (temp != 0) {
            newDigit *= 10;
            newDigit += temp % 10;
            temp /= 10;
        }
        if (newDigit > Math.pow(2, 31) - 1) {
            return 0;
        }
        if (x < 0) {
            return (int) newDigit * -1;
        } else {
            return (int) newDigit;
        }
    }
}