class Solution {
    public int strStr(String haystack, String needle) {
      
        for(int i=0;i<=haystack.length()-needle.length();i++){
              boolean flag = true;
              int id=i;
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(id)){
                   flag = false;
                } 
                id++;
            }
            if(flag){
                return i;
            }

        }

        return -1;
        
    }
}