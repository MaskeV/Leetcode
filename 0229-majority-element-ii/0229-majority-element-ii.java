class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

         HashSet<Integer> set = new HashSet<>();
         for(int n : nums){
            set.add(n);
         }
        for(int n:set){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(n==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/3){
                result.add(n);
            }
        }
        return result;
    }
}