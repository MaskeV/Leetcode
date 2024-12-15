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

    //     HashMap<Integer,Integer> map=new HashMap<>();
    //    List<Integer> result = new ArrayList<>();

    //     for(int i:nums){
    //         map.put(i,map.getOrDefault(i,0)+1);
    //     }
    //     for(int k:map.keySet()){
    //         if(map.get(k)>nums.length/3){
    //             result.add(k);
    //         }

    //     }
    //      return result;
      
        Integer majority1 = 0;
        Integer majority2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == majority1) {
                count1++;
            } else if (num == majority2) {
                count2++;
            } else if (count1 == 0) {
                majority1 = num;
                count1++;
            } else if (count2 == 0) {
                majority2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == majority1) {
                count1++;
            } else if (num == majority2) {
                count2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        if (count1 > n / 3) {
            res.add(majority1);
        }
        if (count2 > n / 3) {
            res.add(majority2);
        }

        return res;        
    }
}
    
   