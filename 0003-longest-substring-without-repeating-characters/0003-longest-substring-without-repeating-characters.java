class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int max=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
          while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
          }
          set.add(s.charAt(right));
          max = Math.max(max,right-left+1);
        }
        return max;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int max =0;
//         int left =0;
//         for(int right = left;right<=s.length();right++){
//             if(isUnique(s.substring(left,right))){
//                 max = Math.max(max,right-left);
//             }else{
//                 left++;
//             }
//         }
//         return max;
//     }
//     boolean isUnique(String s){
//        Map<Character,Integer> map = new HashMap<>();
//        for(char c: s.toCharArray()){
//         map.put(c,map.getOrDefault(c,0)+1);
//        }
//         for(char c: s.toCharArray()){
//         if(map.get(c)>1){
//             return false;
//         }
//        }
//        return true;
//     }
// }