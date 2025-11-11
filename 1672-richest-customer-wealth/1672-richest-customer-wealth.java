class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] acc : accounts){
            int sum=0;
            for(int i : acc){
                  sum+=i;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
        
    }
}