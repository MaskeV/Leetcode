class Solution {
    public boolean checkIfPangram(String sentence) {
    int[] chars = new int[26];
    for(int i=0;i<sentence.length();i++){
        chars[sentence.charAt(i)-'a']++;
    }
    for(int i=0;i<26;i++){
        if(chars[i]==0){
            return false;
        }
    }
    return true;
        
    }
}

// class Solution{
//     public boolean checkIfPangram(String sentence) {
//         Set<Character> set = new HashSet<>();
//         for(char c: sentence.toCharArray()){
//             set.add(c);
//         }
//         if(set.size()!=26){
//             return false;
//         }
//         return true;
//     }

// }