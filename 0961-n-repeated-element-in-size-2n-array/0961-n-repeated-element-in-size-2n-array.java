class Solution {
    public int repeatedNTimes(int[] nums) {
     //   Map<Integer,Integer> map = new HashMap<>();
       // for(int i:nums){
         //   map.put(i,map.getOrDefault(i,0)+1);
           // if(map.get(i)>1){
             //   return i;
            //}
        //}
      //return 0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]){
                return nums[i];
            }
        }
       return nums[nums.length-1];
    }
}