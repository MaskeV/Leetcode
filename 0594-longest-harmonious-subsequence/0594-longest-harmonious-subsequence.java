class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
           int count =0;
           boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]-nums[i]==1  || nums[i]==nums[j]){
                    count++;
                    if(nums[j]-nums[i]==1){
                        flag = true;
                    }
                }
            }
            if(flag){
            max= Math.max(count,max);
            }
        }
        return max;
        
    }
}