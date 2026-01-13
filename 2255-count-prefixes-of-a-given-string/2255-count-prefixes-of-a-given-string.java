class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;

        for(int i=0;i<words.length;i++){

            String str = words[i];
           // if(s.startsWith(str)){
            if(isPrefix(s,str)){
                count++;
            }

        }
        return count;
    }

    boolean isPrefix(String s,String str){
        if(s.length()<str.length()){
            return false;
        }
       int i=0;
        while(i<str.length()){
            if(s.charAt(i)!=str.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}