class Solution {
    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i]=='#' && i>1){
                int index = 10* (chars[i-2]-'0') + (chars[i-1]-'0');
                char ch = (char) (index-1+'a');
                sb.append(ch);
                i-=2;
            }else{
                int index = chars[i]-'0';
                char ch = (char) (index-1+'a');
                sb.append(ch);
            }
        }
            sb.reverse();
            return sb.toString();
        
    }
}