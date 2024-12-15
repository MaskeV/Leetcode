class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer> result = new ArrayList<>();

        //  HashSet<Integer> set = new HashSet<>();
        //  for(int n : nums){
        //     set.add(n);
        //  }
        // for(int n:set){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(n==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/3){
        //         result.add(n);
        //     }
        // }
        // return result;

        HashMap<Integer,Integer> map=new HashMap<>();
       List<Integer> result = new ArrayList<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>nums.length/3){
                result.add(k);
            }

        }
         return result;
      
    
    }
}