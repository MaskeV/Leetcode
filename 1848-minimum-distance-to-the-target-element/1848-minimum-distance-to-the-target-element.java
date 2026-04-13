class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==target){
                int temp = i-start;
                    min = temp;
                    break;
               
            }
        }
           for(int i =start-1;i>=0;i--){
            if(nums[i]==target){
                int temp =start-i;
                min= Math.min(temp,min);
                break;      
            }
        }
        return min;
    }
}