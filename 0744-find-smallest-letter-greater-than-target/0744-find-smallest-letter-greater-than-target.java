class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

      
        

         int a[] = new int[26];
         int s = target-'a';
         for(int i=0;i<letters.length;i++){
           if((letters[i]-'a')>s){
            return letters[i];
           }
         }
        return letters[0];
    }
}