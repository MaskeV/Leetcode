class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       int[] temp= nums.clone();
       Arrays.sort(temp);
       for(int i=0;i<temp.length;i++){
        map.putIfAbsent(temp[i],i);
       }
        int [] result= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = map.get(nums[i]);
        }
       
       return result;
    }
}