class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int start = -n / 2;
        for (int i = 0; i < n; i++) {
            if (n % 2 != 0) {
                arr[i] = start;
                start++;
            } else {
                if (start == 0) {
                    arr[i] = ++start;
                } else {
                    arr[i] = start;
                }
                  start++;
            }
        }
        return arr;
    }
}