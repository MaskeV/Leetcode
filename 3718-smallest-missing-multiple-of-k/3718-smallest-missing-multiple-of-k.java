class Solution {
    public int missingMultiple(int[] nums, int k) {

        int i=1;
        int mul=k;
        while(mul>0){
            boolean flag= false;
            for(int n:nums){
                if(n==mul){
                    flag=true;
                    break;
                }
            
            }

            if(!flag){
                return mul;
            }
            mul=k*i;
            i++;
        }
        return -1;
    }
}