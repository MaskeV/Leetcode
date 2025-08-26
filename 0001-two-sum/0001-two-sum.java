class Solution {
    public int[] twoSum(int[] nums, int target) {
     
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(target-nums[i])){
            return new int[] {i,map.get(target-nums[i])};
        }
        map.put(nums[i],i);
      }
      return new int[] {0,0};

         // for(int i=0;i<nums.length-1;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //             if(nums[j]==target - nums[i]){
    //                 return new int[] {i,j};
    //             }
    //     }
    // }
    // return new int[0];
    }
}

