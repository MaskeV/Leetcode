// class Solution {
//     public boolean hasSpecialSubstring(String s, int k) {
//         int i=0;
//                 for(int j=0;j<s.length();j++){
//                 if(s.charAt(j)==(s.charAt(i))){
//                     if(j-i==k){
//                         return true;
//                     }
//                 }else{
//                     if(j-i==k){
//                         return true;
//                         }
//                 i=j;  
//                 }           

//         }
//         return (s.length()-i)==k;
//     }
// }

class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int i =0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==s.charAt(i)) continue;
            if(j-i==k) return true;
            i=j;
        }
        return (s.length()-i)==k;

    }
}

// class Solution {
//     public boolean hasSpecialSubstring(String s, int k) {
//         int i = 0; // Start of the current repeating substring
        
//         for (int j = 0; j < s.length(); j++) {
//             if (s.charAt(j) != s.charAt(i)) {
//                 // Before resetting i, check if the previous substring had length k
//                 if (j - i == k) {
//                     return true;
//                 }
//                 i = j; // Update start of new substring
//             }
//         }
        
//         // Final check if last substring is of length k
//         return (s.length() - i) == k;
//     }
// }

