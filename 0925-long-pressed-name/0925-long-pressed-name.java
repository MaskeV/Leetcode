class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.charAt(0)!=typed.charAt(0)){
            return false;
        }
      int i=1,j=1;
      while(j<typed.length()){
        if( i<name.length() && name.charAt(i)==typed.charAt(j)){
            i++;
            j++;
        }else if(typed.charAt(j)==typed.charAt(j-1)){
            j++;
        }else{
            return false;
        }

      }
      return i==name.length();
    }
}