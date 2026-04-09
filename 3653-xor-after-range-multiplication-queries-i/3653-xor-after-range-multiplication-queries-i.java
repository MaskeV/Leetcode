class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long res = 0;
        final int mod = 1000000007;
        for(int i=0;i<queries.length;i++){
            for(int j = queries[i][0];j<=queries[i][1];j=j+queries[i][2]){
                long temp=nums[j];
                nums[j]=(int) ((temp*queries[i][3])%mod);
            }
        }

        for(int i=0;i<nums.length;i++){
            res = res ^ nums[i];
        }

        return (int) res;
    }
}