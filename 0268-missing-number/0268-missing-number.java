class Solution {
    public int missingNumber(int[] nums) {
      Arrays.sort(nums);
      for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]!=nums[i]+1){
            return nums[i]+1;
        }
      }
        return nums[nums.length-1]+1;
    }
}