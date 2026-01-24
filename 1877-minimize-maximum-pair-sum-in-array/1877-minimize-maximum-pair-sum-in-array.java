class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int[][] temp = new int[n/2][2];
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
          temp[i][0]=nums[i];
          temp[i][1]=nums[n-1-i];

          if(max<temp[i][0]+temp[i][1]){
            max=temp[i][0]+temp[i][1];
          }
        }

       return max;
    }
}