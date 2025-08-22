class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int count1 = countAlpha(s.substring(0, mid));
        int count2 = countAlpha(s.substring(mid, s.length()));
        return count1 == count2;

    }

    int countAlpha(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'|| s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}