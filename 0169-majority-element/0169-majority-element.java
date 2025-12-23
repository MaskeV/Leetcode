class Solution {
    public int majorityElement(int[] nums) {
    //Arrays.sort(nums);
    //return nums[nums.length/2];
    int candidate =nums[0];
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==candidate){
            count++;
        }else{
            count--;
        }
        if(count==0){
            count++;
            candidate=nums[i];
        }
    }
    return  candidate;
    
    }
}