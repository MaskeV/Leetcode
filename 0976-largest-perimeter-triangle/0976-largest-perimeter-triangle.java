// class Solution {
//     public int largestPerimeter(int[] nums) {
//         int n=nums.length;
//         int max=0;
//         for(int i=0;i<n;i++){
//             int x=nums[i];
//             for(int j=i+1;j<n;j++){
//                 int y=nums[j];
//                 for(int k=j+1;k<n;k++){
//                     int z=nums[k];
//                     if(x+y>z && z+x>y && y+z>x){
//                         int p=x+y+z;
//                         max=Math.max(p,max);
//                     }
//                 }
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}