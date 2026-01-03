class Solution {
    public boolean isAnagram(String s, String t) {
     // Set<Character> set=new HashSet<>();
      //if(s.length()!=t.length()){
        //return false;
     // }
     // for(char c:s.toCharArray()){
        //set.add(c);
      //}
      //for(int i=0;i<t.length();i++){
        //if(!set.contains(t.charAt(i))){
            //return false;
       // }
     // }

       // return true; 


     if(s.length()!=t.length()){
        return false;
     }
      int[] arr = new int[26];
      for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
      }

      for(int i=0;i<26;i++){
        if(arr[i]!=0){
            return false;
        }
      }
      return true;
        
    }
}