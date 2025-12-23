class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int id=0;
        for(int i:map.keySet()){
            for(int j=0;j<map.get(i);j++){
                nums[id]=i;
                id++;
            }
        }
        
    }
}