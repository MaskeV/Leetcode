class Solution {
    public int longestBalanced(String s) {
        int max=1;
        for(int i=0;i<s.length();i++){
            int alpha[] = new int[26];
            for(int j=i;j<s.length();j++){
                alpha[s.charAt(j)-'a']++;
                if(isBalanced(alpha)){
                   if(max<j-i+1){
                    max=j-i+1;
                   }
                }

            }
       }
       return max;
    }

       boolean isBalanced(int alpha[]){
       
                int max=0;
    
       
       for(int i=0;i<26;i++){
    
          if(alpha[i]!=0){
            if(max==0){
           max=alpha[i];
          }
          else if(alpha[i]!=max){
            return false;
          }
          }
        }
       return true;
        
    }
}