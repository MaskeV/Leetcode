class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],inc=1,ans=0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
               sum=sum+nums[i+1];

            }
            else{
              sum=nums[i+1];
            }
         ans=Math.max(ans,sum);
        }
        return ans;
    }
}