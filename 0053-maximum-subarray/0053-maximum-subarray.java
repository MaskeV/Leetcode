// class Solution {
//     public int maxSubArray(int[] nums) {
//     int sum=0;
//     int max=Integer.MIN_VALUE;
//     for(int i:nums){
//         sum=sum+i;
//         if(sum>max){
//             max=sum;
//         }
//         if(sum<0){
//             sum=0;
//         }
//     }
//  return max;
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_sum=Math.max(nums[i],curr_sum+nums[i]);
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
}