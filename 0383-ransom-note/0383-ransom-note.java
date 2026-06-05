class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        char[] big = magazine.toCharArray();
        char[] small = ransomNote.toCharArray();
        int [] hash=new int[26];

        for(int i=0;i<m;i++){
            hash[big[i]-'a']++;
        }
        
        for(int i=0;i<n;i++){
            hash[small[i]-'a']--;
            if(hash[small[i]-'a']<0){
                return false;
            }
        }
          return true;
    }
}




 
     
       
       
 