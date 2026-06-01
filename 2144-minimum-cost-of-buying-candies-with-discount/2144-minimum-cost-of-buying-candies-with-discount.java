class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int counter=0;
        for(int i=cost.length-1;i>=0;i--){
           if(counter<2){
            ans+=cost[i];
            counter++;
           }else{
            counter=0;
           }
        }

        return ans;
        
    }
}