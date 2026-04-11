class Solution {
    public int minimumDistance(int[] nums) {

       Map<Integer, List<Integer>> map = new HashMap<>();

       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            List<Integer> temp  = map.get(nums[i]);
            temp.add(i);
            map.put(nums[i],temp);

        }else{
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            map.put(nums[i],temp);
        }
        
       } 

       int min = Integer.MAX_VALUE;

       for(int i:map.keySet()){
        List<Integer> temp = map.get(i);
        if(temp.size()<3){
          continue;
        }
        for(int j=0;j<=temp.size()-3;j++){
            int ans = 2*(temp.get(j+2)-temp.get(j));
            if(ans<min){
                min=ans;
            }
        }
       } 

       if(min==Integer.MAX_VALUE){
        return -1;
       }
        return min;       
    }
}