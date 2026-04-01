class Solution {
    public int majorityElement(int[] nums) {

        int count =0;
        int find = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(count==0){
                find = nums[i];
            }
            if(nums[i]==find){
                count++;
            }else if(nums[i]!=find){
                count--;
            }
        }
        return find;
    }
}