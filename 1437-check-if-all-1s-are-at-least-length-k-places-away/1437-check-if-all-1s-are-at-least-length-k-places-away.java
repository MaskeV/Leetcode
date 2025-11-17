class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n= nums.length;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==1){
            for(int j=i+1; j<=i+k && j<n ;j++){
                if(nums[j]==1){
                    return false;
                }
            }
          }
        }
        return true;
    }
}