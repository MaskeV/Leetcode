class Solution {
    public int missingNumber(int[] nums) {
    //   Arrays.sort(nums);
    //   if(nums[0]!=0){
    //     return 0;
    //   }
    //   for(int i=1;i<nums.length;i++){
        
    //     if(nums[i]!=i){
    //         return i;
    //     }
    //   }
    //     return nums[nums.length-1]+1;

    int n=nums.length;
    int sum = (n*(n+1))/2;
    int actualSum = Arrays.stream(nums).sum();
    return sum-actualSum;


    }
}