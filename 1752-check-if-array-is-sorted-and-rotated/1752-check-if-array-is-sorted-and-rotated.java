class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
      //  for(int i=0;i<nums.length;i++){
        //    boolean flag = true;
          //  for(int j = i;j<i+n-1;j++){
            //    if(nums[j%n]>nums[(j+1)%n]){
              //   flag = false;
                //}
            //}
             //if(flag){
            //return true;
            //}
        //}

        int count=0;
        for(int i=0;i<n;i++){
           if(nums[i]>nums[(i+1)%n]){
              count++;
           }
           if(count>1){
            return false;
           }
        }
         return true;      
    }
}