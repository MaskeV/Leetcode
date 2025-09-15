class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String[] words=text.split(" ");
        Set<Character> set = new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            set.add(brokenLetters.charAt(i));
        }
        for(String word:words){
            boolean flag =true;
            for(int i=0;i<word.length();i++){
                if(set.contains(word.charAt(i))){
                flag=false;
                break;
                }
            }
            if(flag){
                count++;
            }
            
        }
        return count;
        
    }
}