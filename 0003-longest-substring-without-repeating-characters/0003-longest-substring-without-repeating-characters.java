class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int left =0;
        for(int right = left;right<=s.length();right++){
            if(isUnique(s.substring(left,right))){
                max = Math.max(max,right-left);
            }else{
                left++;
            }
        }
        return max;
    }
    boolean isUnique(String s){
       Map<Character,Integer> map = new HashMap<>();
       for(char c: s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
       }
        for(char c: s.toCharArray()){
        if(map.get(c)>1){
            return false;
        }
       }
       return true;
    }
}