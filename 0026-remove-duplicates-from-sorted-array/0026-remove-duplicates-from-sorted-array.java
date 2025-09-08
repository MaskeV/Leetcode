class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n=nums.length;
//         if(n==1){
//             return n;
//         }
//      int i=1;

//     for(int j=1;j<n;j++){
//         if(nums[j]!=nums[i-1]){
//             nums[i]=nums[j];
//             i++;
//         }
//     }
//     return i;
//     }
// }
