// class Solution {
//     public boolean hasSpecialSubstring(String s, int k) {
//         int i=0;
//         if( k==1){
//             return true;
//         }
//         while(i<=s.length()-k){
//             int j=1;
//             while(j!=k ) {
//                 if(s.charAt(i)==(s.charAt(i+j))){
//                     if(i+j==i+k-1){
//                         return true;
//                     }
//                     j++;
                    
//                 }else{
//                     break;
//                 }
//             }
//           i= i+k;
//         }
//         return false;
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
