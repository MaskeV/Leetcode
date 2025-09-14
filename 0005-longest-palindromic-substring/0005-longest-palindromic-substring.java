class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                if(isPalindrome(s,i,j)){
                    if(j-i+1>max){
                    max = j-i+1;
                    start=i;
                    end=j+1;
                    }
                }
            }
        }
         return s.substring(start,end);
        
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}