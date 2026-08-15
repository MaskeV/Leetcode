class Solution {
    public int longestSubsequence(int[] nums) {
     
     int n = nums.length;
     int total = 0;
     boolean allZero = true;

     for(int i:nums){
        total ^= i;
        if(i>0){
            allZero = false;
        }
     }

     if(total>0){
        return n;
     }

     return allZero ? 0 : n-1;

        
    }
}