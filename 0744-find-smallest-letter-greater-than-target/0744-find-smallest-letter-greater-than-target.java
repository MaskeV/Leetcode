class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char min='z';
        boolean flag =false;
        if(target=='z'){
            return letters[0];
        }
        for(int i=0;i<letters.length;i++){
            if(letters[i]=='z'){
                flag=true;
            }
            if(letters[i]>target && letters[i]<min){
                min = letters[i];
            }

        }

        if(min=='z' && !flag){
            return letters[0];
        }
      
       return min;       
    }
}