class Solution {
    public int findFinalValue(int[] nums, int original) {
        int id=searchArray(nums,original);
        if(id<0){
            return original;
        }else{
            while(id>=0){
            original=2*original;
            id=searchArray(nums,original);
            }
            return original;
          
        }
        
        
    }
    int searchArray(int[] nums,int originals){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==originals){
                return i;
            }
        }
        return -1;
    }
}