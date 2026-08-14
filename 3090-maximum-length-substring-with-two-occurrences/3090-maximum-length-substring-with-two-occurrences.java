class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            int [] freq = new int[26];
            for(int j=i;j<s.length();j++){
                char c = s.charAt(j);
                freq[c-'a']++;
                if(freq[c-'a']<=2){
                    count++;
                }else{
                    break;
                }
            }

            if(max<count){
                max=count;
            }
        }
        return max;
    }
}