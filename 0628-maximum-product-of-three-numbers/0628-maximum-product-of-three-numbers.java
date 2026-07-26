class Solution {
    public int maximumProduct(int[] nums) {

        if(nums.length<3){
            return -1;
        }

        int maxProduct;
        Arrays.sort(nums);
        int n=nums.length;

        maxProduct = Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);

        return maxProduct;
    }
}