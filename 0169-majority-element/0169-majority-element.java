class Solution {
    public int majorityElement(int[] nums) {
    //    Arrays.sort(nums);
       int m=nums.length/2;
    //    return nums[m];

    Map<Integer,Integer> map = new HashMap<>();

    for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(int k : map.keySet()){
        if(map.get(k)>m){
            return k;
        }

    }
    return 0;
    }
}