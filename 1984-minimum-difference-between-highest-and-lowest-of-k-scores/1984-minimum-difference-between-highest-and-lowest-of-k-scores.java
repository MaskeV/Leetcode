class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            if(nums[i+k-1]-nums[i]<ans){
                ans=nums[i+k-1]-nums[i];
            }
        }
        return ans;
    }
}