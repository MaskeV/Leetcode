class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] count =new int[nums.length];
        Arrays.fill(count,0);
        for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++) {
                    if(nums[j]<nums[i]){
                        count[i]++;
                    }

                }
        }
        return count;
    }
}