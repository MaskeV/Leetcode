// class Solution {
//    public void moveZeroes(int[] nums) {
//     int [] ans = new int [nums.length];
//     int j=0;
//     for(int num:nums){
//         if(num!=0){
//             ans[j]=num;
//             j++;
//         }
//     }
//     for(int i=0;i<nums.length;i++){
//        nums[i]=ans[i];
//     }
    
//      }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}