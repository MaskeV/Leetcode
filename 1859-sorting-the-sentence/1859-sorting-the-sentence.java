class Solution {
    public String sortSentence(String s) {
        String[] temp = s.split(" ");
        String [] ans = new String[temp.length];
        for(String word:temp){
            int idx= word.charAt(word.length()-1)-'0';
           
            ans[idx-1]=word.substring(0,word.length()-1);
        }
        String res = String.join(" ",ans);
        return res;
    }
}