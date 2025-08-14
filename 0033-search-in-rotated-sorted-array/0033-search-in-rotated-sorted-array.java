class Solution {
    public int search(int[] nums, int target) {
        int max = maxElement(nums);
        int ans = binarySearch(nums,target,0,max);
        if(ans!=-1){
            return ans;
        }
        if(max<nums.length-1){
            return binarySearch(nums,target,max+1,nums.length-1);
        }
        return -1;

    }

    private int maxElement(int[] nums){
          int start=0,end=nums.length-1;
        int max=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if( mid<end && nums[mid]>nums[mid+1]){
            return mid;
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[start]>=nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    private int binarySearch(int[] nums,int target,int start,int end){
       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]>target){
            end=mid-1;
        }else if(nums[mid]<target){
            start=mid+1;
        }else{
            return mid;
        }
       
       }
        return -1;
    }
}


// class Solution {
//     public int search(int[] nums, int target) {
//        int  start=0,end=nums.length-1;
//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }else if(nums[start]<=nums[mid]){
//                 if(nums[start]<=target && nums[mid]>=target){
//                   end =mid-1;
//                 }else{
//                     start=mid+1;
//                 }
//             }else{
//                 if(nums[end]>=target && target>=nums[mid]){
//                     start=mid+1;
//                 }else{
//                     end=mid-1;
//                 }
//             }

//             }
        
//             return -1;
//      }
// }