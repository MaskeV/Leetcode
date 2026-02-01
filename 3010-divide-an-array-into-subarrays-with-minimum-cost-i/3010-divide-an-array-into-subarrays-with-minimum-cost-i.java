class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        int min=Integer.MAX_VALUE;
        int idx=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]<min){
            min=nums[i];
            idx=i;
           }
        }
          sum+=min;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(i==idx){
                continue;
            }
           if(nums[i]<min2){
            min2=nums[i];
           }
        }
           sum+=min2;
        return sum;
    }
}