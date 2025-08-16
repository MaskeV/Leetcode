// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] ans = {-1,-1};
//         int start = binarySearch(nums,target,true);
//         int end = binarySearch(nums,target,false);
//         ans[0]=start;
//         ans[1]=end;
//         return ans;
        
//     }
//    private int binarySearch(int[] nums, int target ,boolean isSearchingStart){
//     int i=0,j=nums.length-1;
//     int ans=-1;
//         while(i<=j){
//             int mid = i+(j-i)/2;
//             if(nums[mid]>target){
//                 j=mid-1;
//             }else if(nums[mid]<target){
//                 i=mid+1;
//             }else{
//                 ans=mid;
//                   if(isSearchingStart){
//                     j=mid-1;
//                   }else{
//                     i=mid+1;
//                   }
//                 }
//             }
//              return ans;
//         }    
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }

    
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                ans[1] = j;
                break;
            }
        }

        return ans;
    }
}
