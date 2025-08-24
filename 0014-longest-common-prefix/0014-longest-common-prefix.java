
class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);
      String first=strs[0];
      String last=strs[strs.length-1];
      int idx=0;

      for(int i=0;i<first.length();i++){
        if(first.charAt(i)==last.charAt(i)){
            idx++;
        }else{
            break;
        }
      }
           return first.substring(0,idx);
    }
}
        
        
        
        // class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);
//         String s1 = strs[0];
//         String s2 = strs[strs.length-1];
//         int idx = 0;
//         while(idx < s1.length() && idx < s2.length()){
//             if(s1.charAt(idx) == s2.charAt(idx)){
//                 idx++;
//             } else {
//                 break;
//             }
//         }
//         return s1.substring(0, idx);
        
//     }
// }