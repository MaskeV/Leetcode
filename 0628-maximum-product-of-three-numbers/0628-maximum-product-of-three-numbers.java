class Solution {
    public int maximumProduct(int[] nums) {

        int maxProduct;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i:nums){
           if(i>max){
            thirdMax=secondMax;
            secondMax = max;
            max=i;
           }else if(i>secondMax){
              thirdMax = secondMax;
              secondMax=i;
           }else if(i>thirdMax){
            thirdMax=i;
           }

           if(i<min){
            secondMin=min;
            min =i;
           }else if(i<secondMin){
            secondMin=i;
           }
        }
        
        return Math.max(max*secondMax*thirdMax, min*secondMin*max);
    }
}