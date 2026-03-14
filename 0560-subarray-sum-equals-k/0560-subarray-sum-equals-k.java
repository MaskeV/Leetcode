class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                 if(nums[j]+sum==k){
                    count++;
                 }
                 sum+=nums[j];
            }
        }
        return count;
    }
}