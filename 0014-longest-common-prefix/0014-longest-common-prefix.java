
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1= strs[0];
        String s2=strs[strs.length-1];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
               return sb.toString();
            }
        }
        return sb.toString();
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