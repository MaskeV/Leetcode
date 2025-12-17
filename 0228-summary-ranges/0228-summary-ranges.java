class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int id=nums[0];
        int j=0;
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i-1]+1!=nums[i]){
                if(nums[j]==nums[i-1]){
                    ans.add(Integer.toString(nums[j]));
                }else{
           ans.add(nums[j]+"->"+nums[i-1]);
                }
                j=i;
               
            }
      

        }
        return ans;
        
    } 
}