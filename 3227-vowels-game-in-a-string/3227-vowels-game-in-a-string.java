class Solution {
    public boolean doesAliceWin(String s) {
        int vowels=0;
        for (int i = 0; i < s.length(); i++){
            char c=s.charAt(i);
           if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            vowels++;
           }

        }
        if( vowels!=0 && vowels%2==0){
            return true;
        }
        if(vowels%2!=0){
            return true;
        }
    
        return false;
    }
}