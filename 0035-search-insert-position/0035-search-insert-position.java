
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j = nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]>target){
                j = mid-1;
            }else  if(nums[mid]<target){
                i = mid+1;
            }else{
                return mid;
            }
        }
        return i;
    }
    
}


// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]>=target){
//                 return i; 
//             }
//         }
//         return n;
        
    
//         }
        
//     }
