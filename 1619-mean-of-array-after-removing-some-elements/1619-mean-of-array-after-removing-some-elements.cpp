class Solution {
public:
    double trimMean(vector<int>& arr) {
        double ind = arr.size() / 20;
        sort(arr.begin(), arr.end());
        int i = 0, j = arr.size();
        while (i < ind) {
            i++;
        }
        while (j > arr.size() - ind) {
            j--;
        }
        double sum = 0;
        for (int k = i; k < j; k++) {
            sum += arr[k];
        }
        return sum / (arr.size() - (ind * 2));
    }
};