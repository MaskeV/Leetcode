class Solution {
    public int removeDuplicates(int[] nums) {
     HashSet<Integer> set=new LinkedHashSet<>();
     for(int i:nums){
        set.add(i);
     }
     int id=0;
     for(int i:set){
       nums[id]=i;
       id++;
     }
return set.size();
    }
}
