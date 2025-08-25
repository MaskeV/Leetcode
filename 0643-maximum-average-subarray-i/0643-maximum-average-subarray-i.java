class Solution {
    public double findMaxAverage(int[] arr, int k) {
       double windowSum=0;
       
       for(int i=0;i<k;i++){
        windowSum+=arr[i];
       }
       double max = windowSum;

       for(int i=k;i<arr.length;i++){
        windowSum = windowSum + (arr[i]-arr[i-k]);
        max = Math.max(max,windowSum);
       }
       return max/k;
  }
}