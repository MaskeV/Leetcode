class Solution {
    public int[] leftRightDifference(int[] nums) {

      int[] leftSum = new int[nums.length];
      int[] rightSum = new int[nums.length];

      for(int i=1;i<nums.length;i++){
        if(i-1<nums.length){
           leftSum[i] = leftSum[i-1]+nums[i-1];
        }
      }

      for(int j = nums.length-2;j>=0;j--){
        if(j+1<nums.length){
            rightSum[j] = rightSum[j+1]+nums[j+1];
        }
      }

      for(int i=0;i<nums.length;i++){
        leftSum[i] = Math.abs(leftSum[i]-rightSum[i]);
      }
      return leftSum;

    }
}