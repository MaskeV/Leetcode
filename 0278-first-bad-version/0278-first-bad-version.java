/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0,end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            boolean bad = isBadVersion(mid);
            if(bad==false){
             start=mid+1;
            }else if(isBadVersion(mid-1)){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}