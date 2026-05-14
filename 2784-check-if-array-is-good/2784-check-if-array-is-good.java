class Solution {
    public boolean isGood(int[] nums) {

      int[] freq = new int[201];
      int max=0;
      for(int i=0;i<nums.length;i++){
        freq[nums[i]]++;
      }

      int temp=2;
      boolean flag = true;
      for(int i=200;i>0;i--){
        if(flag){
            if(freq[i]==2){
            flag = false;
            temp=1;
            }else if(freq[i]>0){
                return false;
            }
        }else{
            if( freq[i]!=1){
            return false;
            }
        }
      }      
        return true;
       


    }
}