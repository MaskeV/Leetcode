/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0,end=mountainArr.length()-1;
        while(start!=end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }else if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }
        }
        int newStart=end;
        int newEnd=start;
        boolean flag=true;
        int ans=binarySearch(target, mountainArr,0,newEnd,flag);
        if(ans!=-1){
            return ans;
        }
        flag=false;
         ans=binarySearch( target,mountainArr,newStart,mountainArr.length()-1,flag);
         return ans;
        
    }
    private int binarySearch(int target, MountainArray mountainArr,int start,int end,boolean flag){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(flag){
           if(mountainArr.get(mid)>target){
            end=mid-1;
           }else{
            start=mid+1;
           }
            }
            else{
                if(mountainArr.get(mid)>target){
            start=mid+1;
           }else{
            end=mid-1;
           }

            }
        }
            return -1;

    }
}