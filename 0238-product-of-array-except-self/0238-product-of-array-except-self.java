class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product =1;
        int productZero=1;
      
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                product =0;
                
            }else{
            product = product * nums[i];
            productZero *= nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=productZero;
            }else{
            res[i]=product/nums[i];
            }
            
        }

      
        return res;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//      int[] res = new int[nums.length];
//      Arrays.fill(res,1);
//      int l=1,r=1;
//      for(int i=0;i<nums.length;i++){
//         res[i]=res[i]*l;
//         l=l*nums[i];
//      }
//      for(int i=nums.length-1;i>=0;i--){
//         res[i]=res[i]*r;
//         r=r*nums[i];
//      }
//      return res;
//     }
// }