class Solution {
    public int maxProduct(int[] nums) {

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i:nums){
            if(max<i){
                secondMax=max;
                max=i;
            }else if(secondMax<i){
                secondMax=i;
            }
        }
        return (max-1)*(secondMax-1);
    }
}