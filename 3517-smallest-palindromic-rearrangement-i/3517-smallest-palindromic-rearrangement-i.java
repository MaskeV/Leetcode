class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        
        StringBuilder left = new StringBuilder();
        char middle =' ';

        for(int i=0;i<26;i++){

            if(freq[i]%2==1){
                middle= (char) ('a'+i);
            }

            for(int j=0;j<freq[i]/2;j++){
              left.append((char) ('a'+i));
            }

        }
        
        StringBuilder right =  new StringBuilder(left).reverse();

        if(middle==' '){
            return left.toString()+right.toString();
        }

        return left.toString()+middle+right.toString();
    }
}