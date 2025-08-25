class Solution {
    public int maxVowels(String s, int k) {
      int left=0;
      int vowel=0;
      int max=0;
      for(int right=0;right<s.length();right++){
        if(isVowel(s.charAt(right))){
            vowel++;
        }
        if((right-left+1)==k){
            max = Math.max(max,vowel);
            if(isVowel(s.charAt(left))){
                vowel--;
            }
            left++;
        }
      }
        return max;
      }
        boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}