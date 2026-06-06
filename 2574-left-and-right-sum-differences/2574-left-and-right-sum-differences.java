class Solution {
    public int[] leftRightDifference(int[] nums) {
     
     int [] ans = new int[nums.length];
     int sum=0;
    
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      }

      int leftSum =0;
      for(int i=0;i<nums.length;i++){
        int rightSum =sum-leftSum-nums[i];
        ans[i] = Math.abs(leftSum-rightSum);
        leftSum += nums[i];
      }
      return ans;

    }
}