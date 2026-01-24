class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        int max=0;
 
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
        int sum = nums[i]+nums[n-1-i];

          if(max<sum){
            max=sum;
          }
        }

       return max;
    }
}