class Solution {
    public int largestInteger(int[] nums, int k) {

      int n = nums.length;

      int max = 0;
    
     if(n==k){
      for(int i:nums){
        if(i>max){
            max=i;
        }
      }
      return max;
     }


      int[] freq = new int[51];

      for(int i:nums){
        freq[i]++;
      }
      if(k==1){
         for(int i=50;i>=0;i--){
             if(freq[i]==1){
                return i;
             }

         }

         return -1;
      }

    

      if(freq[nums[0]]==1 && freq[nums[n-1]]==1){
        return Math.max(nums[0],nums[n-1]);
      }

      if(freq[nums[0]]==1){
        return nums[0];
      }

      if(freq[nums[n-1]]==1){
        return nums[n-1];
      }

      return -1;
        
    }
}