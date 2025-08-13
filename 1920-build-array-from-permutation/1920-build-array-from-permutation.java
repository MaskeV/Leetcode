class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int idx=0;
        for(int i:nums){
            ans[idx]=nums[i];
            idx++;
        }
       return ans; 
    }
}