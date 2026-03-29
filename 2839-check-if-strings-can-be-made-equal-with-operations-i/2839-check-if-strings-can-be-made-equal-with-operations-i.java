class Solution {
    public boolean canBeEqual(String s1, String s2) {
      if(s1.length()!=s2.length()){
        return false;
      }
      StringBuilder sb = new StringBuilder(s2);


      for(int i=0;i<s1.length()-2;i++){
        if(s1.charAt(i)!=sb.charAt(i)){
          char temp = sb.charAt(i);
          sb.setCharAt(i,sb.charAt(i+2));
          sb.setCharAt(i+2,temp); 

        }
        if(s1.equals(sb.toString())){
            return true;
        }
        
      }
      return false;   
    }
}