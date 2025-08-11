class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] res = new int[nums.length];
     Arrays.fill(res,1);
     int l=1,r=1;
     for(int i=0;i<nums.length;i++){
        res[i]=res[i]*l;
        l=l*nums[i];
     }
     for(int i=nums.length-1;i>=0;i--){
        res[i]=res[i]*r;
        r=r*nums[i];
     }
     return res;
    }
}