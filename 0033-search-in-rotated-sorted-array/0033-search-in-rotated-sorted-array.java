// 
class Solution {
    public int search(int[] nums, int target) {
        int peak=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                peak=i;
            }
        }
        int ans = binarySearch(nums,target,0,peak);
        if(ans!=-1){
            return ans;
        }if(peak<nums.length-1){
        return binarySearch(nums,target,peak+1,nums.length-1);
        }
        return -1;

    }

     //when order is not known 
     private int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                   end=mid-1;
            }else{
                start=mid+1;
            }

            }
        
            return -1;
     }
}