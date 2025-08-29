class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() ; j++) {
                if (palindrome(s.substring(i, j + 1))) {
                    if ((j - i + 1) > max) {
                        max = Math.max(max, (j - i + 1));
                        start = i;
                        end = j;

                    }
                }

            }
        }
        return s.substring(start, end + 1);

    }

    boolean palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;

    }
}