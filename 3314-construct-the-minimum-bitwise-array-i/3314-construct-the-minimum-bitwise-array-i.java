class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {



        int ans [] = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            boolean flag = false;
            for(int j=0;j<=nums.get(i);j++){
                if((j|(j+1))==nums.get(i)){
                    ans[i]=j;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans[i]=-1;
            }
        }

        return ans;
    }
}