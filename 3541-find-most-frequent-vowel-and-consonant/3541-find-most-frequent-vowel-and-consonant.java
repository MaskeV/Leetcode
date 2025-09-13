class Solution {
    public int maxFreqSum(String s) {
        int maxVowel=0;
        int maxConsonant=0;
        int [] alpha = new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            alpha[c-'a']++;
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                maxVowel = Math.max(maxVowel,alpha[c-'a']);
            }else{
                maxConsonant = Math.max(maxConsonant,alpha[c-'a']);
            }
        }
     return maxVowel+maxConsonant;
    }
}