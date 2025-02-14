class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid;
        int[] merged=new int[nums1.length+nums2.length];
        int i=0, j=0,k=0;
        while((i<nums1.length) && (j<nums2.length))
        {
            if(nums1[i]>nums2[j]){
                merged[k]=nums2[j];
                j++;
                k++;
            }
            else{
                merged[k]=nums1[i];
                i++;
                k++;
            }
        }
        while(i<nums1.length){
          merged[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            merged[k]=nums2[j];
                j++;
            k++;
        }
        if(merged.length%2!=0){
            mid=merged[merged.length/2];
        }else{
            mid=(merged[merged.length/2-1]+merged[merged.length/2])/2.0;
        }
        return mid;
    }
}