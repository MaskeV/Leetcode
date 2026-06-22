class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i=0;i<text.length();i++){
            char c= text.charAt(i);
            freq[c-'a']++;
        }

        String check = "balloon";
        int min = Integer.MAX_VALUE;

        for(int i=0;i<check.length();i++){
           char c=check.charAt(i);
           if(c=='o' || c=='l'){
               if(freq[c-'a']/2<min){
               min = freq[c-'a']/2;
               }
           }else if( freq[c-'a']<min){
            min = freq[c-'a'];
           }
        }
        return min;
    }
}