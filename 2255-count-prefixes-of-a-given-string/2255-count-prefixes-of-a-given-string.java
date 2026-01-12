class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;

        for(int i=0;i<words.length;i++){

            String str = words[i];
            if(s.startsWith(str)){
                count++;
            }

        }
        return count;
    }
}