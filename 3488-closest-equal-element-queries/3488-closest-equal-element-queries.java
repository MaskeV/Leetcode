class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               List<Integer> temp = map.get(nums[i]);
               temp.add(i);
               map.put(nums[i],temp);
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(nums[i],temp);
            }
        } 


         for(int i:queries){
            List<Integer> temp = map.get(nums[i]);
            if(temp.size()<2){
                ans.add(-1);
            }else{
                int min = Integer.MAX_VALUE;
                for(int j:temp){
                    if(j==i){
                        continue;
                    }
                    min = Math.min(min,Math.abs(i-j));
                    min = Math.min(min,n-Math.abs(i-j));
                }
                ans.add(min);
            }
         }
        return ans; 
    }
}