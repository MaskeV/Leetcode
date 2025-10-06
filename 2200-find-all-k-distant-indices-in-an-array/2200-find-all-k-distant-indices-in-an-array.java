class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(nums[i]==key){
            int j=i-k<0? 0:i-k;
            int n=k+i<nums.length ? k+i:nums.length-1; 
            while(j<=n){
            ans.add(j);
            j++;
            }
           }
        }
        Set<Integer> set=new HashSet<>(ans);
         ans = new ArrayList<>(set);
         Collections.sort(ans);
        return ans;
    }
}