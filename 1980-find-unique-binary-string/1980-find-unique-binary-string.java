class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> arr= new HashSet<>();
        int ans=0;

        for(int i=0;i<nums.length;i++){
            arr.add(Integer.parseInt(nums[i],2));

        }

        double n=Math.pow(2,nums.length);

        for(int i=0;i<n;i++){
            if(!(arr.contains(i))){
                 ans = i;
                break;
            }
        }
        String res = Integer.toBinaryString(ans);
        return res;

        
    }
}