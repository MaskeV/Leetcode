class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int max=0;
        int countZero=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                countZero++;
            }
            while(countZero>1){
                if(nums[left]==0){
                    countZero--;
                }
                left++;
            }

        max=Math.max(max,right-left);
        }
        return max;
    }
}