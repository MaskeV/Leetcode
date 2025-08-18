class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for(String word:words){
            for(int i=word.length()-1;i>=0;i--){
              ans.append(word.charAt(i));
            }
            ans.append(" ");
        }
        return ans.toString().trim();
        
    }
}