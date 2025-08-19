class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");

        for(String word:words){
            int left=0;
            int right=word.length()-1;
            char[] chars=word.toCharArray();
            while(left<right){
                char temp = chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            ans.append(new String(chars)+" ");
        }
        return ans.toString().trim();
        
    }
}