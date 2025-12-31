class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int minId=0;
        int maxId=s.length()-1;
        for(int i=0;i<s.length();i++){
           for(int j=i;j<s.length();j++){
            
              if(isPalindrome(s,i,j)){
                if((j-i)+1>max){
                    max=(j-i)+1;
                    minId=i;
                    maxId=j;
                }
              }
           }
    
        }
         return s.substring(minId,maxId+1);
    }
    boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}